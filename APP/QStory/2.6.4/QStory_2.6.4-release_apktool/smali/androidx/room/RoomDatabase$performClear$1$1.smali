.class final Landroidx/room/RoomDatabase$performClear$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/RoomDatabase$performClear$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;",
        "connection",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.RoomDatabase$performClear$1$1"
    f = "RoomDatabase.android.kt"
    l = {
        0x214,
        0x215,
        0x217,
        0x21d,
        0x21e,
        0x21f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $hasForeignKeys:Z

.field final synthetic $tableNames:[Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/room/飘花落叶言子楪兰哲苏世;


# direct methods
.method public constructor <init>(Landroidx/room/飘花落叶言子楪兰哲苏世;Z[Ljava/lang/String;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u82cf\u4e16;",
            "Z[",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/RoomDatabase$performClear$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->this$0:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$hasForeignKeys:Z

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$tableNames:[Ljava/lang/String;

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
    new-instance v0, Landroidx/room/RoomDatabase$performClear$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->this$0:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$hasForeignKeys:Z

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$tableNames:[Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Landroidx/room/RoomDatabase$performClear$1$1;-><init>(Landroidx/room/飘花落叶言子楪兰哲苏世;Z[Ljava/lang/String;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/room/飘花落叶言子世苏楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabase$performClear$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/room/RoomDatabase$performClear$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/room/RoomDatabase$performClear$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/room/RoomDatabase$performClear$1$1;->invoke(Landroidx/room/飘花落叶言子世苏楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v2

    .line 15
    :pswitch_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :pswitch_1
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :pswitch_2
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :pswitch_3
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :pswitch_4
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_5
    iget-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 68
    .line 69
    iput-object p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    iput v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 73
    .line 74
    invoke-interface {p1, p0}, Landroidx/room/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v0, :cond_0

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_0
    move-object v6, v1

    .line 82
    move-object v1, p1

    .line 83
    move-object p1, v6

    .line 84
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_1

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->this$0:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲()Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    const/4 v3, 0x2

    .line 101
    iput v3, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_1

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_1
    :goto_1
    sget-object p1, Landroidx/room/Transactor$SQLiteTransactionType;->IMMEDIATE:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 111
    .line 112
    new-instance v3, Landroidx/room/RoomDatabase$performClear$1$1$1;

    .line 113
    .line 114
    iget-boolean v4, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$hasForeignKeys:Z

    .line 115
    .line 116
    iget-object v5, p0, Landroidx/room/RoomDatabase$performClear$1$1;->$tableNames:[Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {v3, v4, v5, v2}, Landroidx/room/RoomDatabase$performClear$1$1$1;-><init>(Z[Ljava/lang/String;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 119
    .line 120
    .line 121
    iput-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    const/4 v4, 0x3

    .line 124
    iput v4, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 125
    .line 126
    invoke-interface {v1, p1, v3, p0}, Landroidx/room/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_2

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_2
    :goto_2
    iput-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    const/4 p1, 0x4

    .line 136
    iput p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 137
    .line 138
    invoke-interface {v1, p0}, Landroidx/room/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v0, :cond_3

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_3
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_6

    .line 152
    .line 153
    iput-object v1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    const/4 p1, 0x5

    .line 156
    iput p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 157
    .line 158
    const-string p1, "PRAGMA wal_checkpoint(FULL)"

    .line 159
    .line 160
    invoke-static {v1, p1, p0}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_4

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_4
    :goto_4
    iput-object v2, p0, Landroidx/room/RoomDatabase$performClear$1$1;->L$0:Ljava/lang/Object;

    .line 168
    .line 169
    const/4 p1, 0x6

    .line 170
    iput p1, p0, Landroidx/room/RoomDatabase$performClear$1$1;->label:I

    .line 171
    .line 172
    const-string p1, "VACUUM"

    .line 173
    .line 174
    invoke-static {v1, p1, p0}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-ne p1, v0, :cond_5

    .line 179
    .line 180
    :goto_5
    return-object v0

    .line 181
    :cond_5
    :goto_6
    iget-object p0, p0, Landroidx/room/RoomDatabase$performClear$1$1;->this$0:Landroidx/room/飘花落叶言子楪兰哲苏世;

    .line 182
    .line 183
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲()Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 188
    .line 189
    .line 190
    :cond_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
