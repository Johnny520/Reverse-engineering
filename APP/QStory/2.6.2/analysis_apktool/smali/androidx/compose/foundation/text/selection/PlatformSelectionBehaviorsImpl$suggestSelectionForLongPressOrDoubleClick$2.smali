.class final Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
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
        "Landroid/view/textclassifier/TextClassifier;",
        "Landroidx/compose/ui/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a;",
        "<anonymous>",
        "(Landroid/view/textclassifier/TextClassifier;)Landroidx/compose/ui/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2"
    f = "PlatformSelectionBehaviors.android.kt"
    l = {
        0x171,
        0x9f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $selection:J

.field final synthetic $text:Ljava/lang/CharSequence;

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "J",
            "Landroidx/compose/foundation/text/selection/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$text:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$selection:J

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 6
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
    new-instance v0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$text:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$selection:J

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Landroid/view/textclassifier/TextClassifier;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/textclassifier/TextClassifier;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/ui/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->invoke(Landroid/view/textclassifier/TextClassifier;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->J$0:J

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->J$0:J

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$3:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/lang/CharSequence;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$2:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 36
    .line 37
    iget-object v5, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Landroid/view/textclassifier/TextSelection;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v9, p1

    .line 55
    check-cast v9, Landroid/view/textclassifier/TextClassifier;

    .line 56
    .line 57
    invoke-static {}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$text:Ljava/lang/CharSequence;

    .line 61
    .line 62
    iget-wide v5, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$selection:J

    .line 63
    .line 64
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(J)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-wide v5, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$selection:J

    .line 69
    .line 70
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(J)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {p1, v1, v5}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/CharSequence;II)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Landroid/os/LocaleList;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {p1, v1}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲世苏兰(Landroid/view/textclassifier/TextSelection$Request$Builder;Landroid/os/LocaleList;)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    const/16 v5, 0x1f

    .line 91
    .line 92
    if-lt v1, v5, :cond_3

    .line 93
    .line 94
    invoke-static {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪哲苏兰(Landroid/view/textclassifier/TextSelection$Request$Builder;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏世兰(Landroid/view/textclassifier/TextSelection$Request$Builder;)Landroid/view/textclassifier/TextSelection$Request;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v9, p1}, Landroidx/activity/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世(Landroid/view/textclassifier/TextClassifier;Landroid/view/textclassifier/TextSelection$Request;)Landroid/view/textclassifier/TextSelection;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionStartIndex()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionEndIndex()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-static {v6, v7}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    if-lt v1, v5, :cond_5

    .line 118
    .line 119
    invoke-static {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏兰世哲(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 126
    .line 127
    iget-object v5, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 128
    .line 129
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$text:Ljava/lang/CharSequence;

    .line 130
    .line 131
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$0:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v5, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$1:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v1, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$2:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->L$3:Ljava/lang/Object;

    .line 138
    .line 139
    iput-wide v7, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->J$0:J

    .line 140
    .line 141
    iput v3, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->label:I

    .line 142
    .line 143
    invoke-virtual {v5, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-ne p0, v0, :cond_4

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    move-object p0, p1

    .line 151
    move-object v3, v1

    .line 152
    move-wide v0, v7

    .line 153
    :goto_0
    :try_start_0
    new-instance p1, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏兰楪;

    .line 154
    .line 155
    invoke-static {p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-direct {p1, v2, v0, v1, p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏兰楪;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    .line 163
    .line 164
    .line 165
    iget-object p0, v3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 166
    .line 167
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    .line 171
    .line 172
    check-cast v5, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 173
    .line 174
    invoke-virtual {v5, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :catchall_0
    move-exception v0

    .line 179
    move-object p0, v0

    .line 180
    check-cast v5, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 181
    .line 182
    invoke-virtual {v5, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :cond_5
    iget-object v5, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->this$0:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;

    .line 187
    .line 188
    iget-object v6, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->$text:Ljava/lang/CharSequence;

    .line 189
    .line 190
    iput-wide v7, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->J$0:J

    .line 191
    .line 192
    iput v2, p0, Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;->label:I

    .line 193
    .line 194
    move-object v10, p0

    .line 195
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏兰世;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-ne p0, v0, :cond_6

    .line 200
    .line 201
    :goto_1
    return-object v0

    .line 202
    :cond_6
    move-wide v0, v7

    .line 203
    :goto_2
    new-instance p0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;

    .line 204
    .line 205
    invoke-direct {p0, v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;-><init>(J)V

    .line 206
    .line 207
    .line 208
    return-object p0
.end method
