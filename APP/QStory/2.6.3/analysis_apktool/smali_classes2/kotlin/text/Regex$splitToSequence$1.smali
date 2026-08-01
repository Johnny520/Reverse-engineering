.class final Lkotlin/text/Regex$splitToSequence$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/Regex;->splitToSequence(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
        "",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlin.text.Regex$splitToSequence$1"
    f = "Regex.kt"
    l = {
        0x128,
        0x130,
        0x134
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $input:Ljava/lang/CharSequence;

.field final synthetic $limit:I

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lkotlin/text/Regex;


# direct methods
.method public constructor <init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/text/Regex;",
            "Ljava/lang/CharSequence;",
            "I",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/text/Regex$splitToSequence$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlin/text/Regex$splitToSequence$1;->this$0:Lkotlin/text/Regex;

    .line 2
    .line 3
    iput-object p2, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput p3, p0, Lkotlin/text/Regex$splitToSequence$1;->$limit:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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
    new-instance v0, Lkotlin/text/Regex$splitToSequence$1;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlin/text/Regex$splitToSequence$1;->this$0:Lkotlin/text/Regex;

    .line 4
    .line 5
    iget-object v2, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget p0, p0, Lkotlin/text/Regex$splitToSequence$1;->$limit:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Lkotlin/text/Regex$splitToSequence$1;-><init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lkotlin/text/Regex$splitToSequence$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex$splitToSequence$1;->invoke(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex$splitToSequence$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/text/Regex$splitToSequence$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkotlin/text/Regex$splitToSequence$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, Lkotlin/text/Regex$splitToSequence$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lkotlin/text/Regex$splitToSequence$1;->label:I

    .line 8
    .line 9
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    if-eq v2, v7, :cond_0

    .line 18
    .line 19
    if-eq v2, v5, :cond_2

    .line 20
    .line 21
    if-ne v2, v4, :cond_1

    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Lkotlin/text/Regex$splitToSequence$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/util/regex/Matcher;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v6

    .line 37
    :cond_2
    iget v2, p0, Lkotlin/text/Regex$splitToSequence$1;->I$1:I

    .line 38
    .line 39
    iget-object v8, p0, Lkotlin/text/Regex$splitToSequence$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, Ljava/util/regex/Matcher;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lkotlin/text/Regex$splitToSequence$1;->this$0:Lkotlin/text/Regex;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/text/Regex;->access$getNativePattern$p(Lkotlin/text/Regex;)Ljava/util/regex/Pattern;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v2, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget v2, p0, Lkotlin/text/Regex$splitToSequence$1;->$limit:I

    .line 63
    .line 64
    if-eq v2, v7, :cond_8

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/4 v2, 0x0

    .line 74
    move-object v8, p1

    .line 75
    move p1, v2

    .line 76
    :goto_0
    iget-object v9, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->start()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    invoke-interface {v9, v2, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iput-object v0, p0, Lkotlin/text/Regex$splitToSequence$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v8, p0, Lkotlin/text/Regex$splitToSequence$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v2, p0, Lkotlin/text/Regex$splitToSequence$1;->I$0:I

    .line 95
    .line 96
    iput p1, p0, Lkotlin/text/Regex$splitToSequence$1;->I$1:I

    .line 97
    .line 98
    iput v5, p0, Lkotlin/text/Regex$splitToSequence$1;->label:I

    .line 99
    .line 100
    invoke-virtual {v0, v9, p0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-ne v2, v1, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move v2, p1

    .line 108
    :goto_1
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->end()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    add-int/2addr v2, v7

    .line 113
    iget v9, p0, Lkotlin/text/Regex$splitToSequence$1;->$limit:I

    .line 114
    .line 115
    sub-int/2addr v9, v7

    .line 116
    if-eq v2, v9, :cond_7

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_6

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move v11, v2

    .line 126
    move v2, p1

    .line 127
    move p1, v11

    .line 128
    goto :goto_0

    .line 129
    :cond_7
    :goto_2
    iget-object v5, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    invoke-interface {v5, p1, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    iput-object v6, p0, Lkotlin/text/Regex$splitToSequence$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v6, p0, Lkotlin/text/Regex$splitToSequence$1;->L$1:Ljava/lang/Object;

    .line 146
    .line 147
    iput p1, p0, Lkotlin/text/Regex$splitToSequence$1;->I$0:I

    .line 148
    .line 149
    iput v2, p0, Lkotlin/text/Regex$splitToSequence$1;->I$1:I

    .line 150
    .line 151
    iput v4, p0, Lkotlin/text/Regex$splitToSequence$1;->label:I

    .line 152
    .line 153
    invoke-virtual {v0, v5, p0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, v1, :cond_9

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_8
    :goto_3
    iget-object p1, p0, Lkotlin/text/Regex$splitToSequence$1;->$input:Ljava/lang/CharSequence;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object v6, p0, Lkotlin/text/Regex$splitToSequence$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v6, p0, Lkotlin/text/Regex$splitToSequence$1;->L$1:Ljava/lang/Object;

    .line 169
    .line 170
    iput v7, p0, Lkotlin/text/Regex$splitToSequence$1;->label:I

    .line 171
    .line 172
    invoke-virtual {v0, p1, p0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v1, :cond_9

    .line 177
    .line 178
    :goto_4
    return-object v1

    .line 179
    :cond_9
    return-object v3
.end method
