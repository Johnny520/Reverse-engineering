.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x298382

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    sget-object p1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    sget-object v0, Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Landroid/content/Context;)Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    invoke-virtual {p1}, Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Ltop/suzhelan/qstory/database/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 26
    .line 27
    new-instance v1, Ltop/suzhelan/qstory/hook/item/chat/PreventRetractingMessage$initializeStorage$1;

    .line 28
    .line 29
    invoke-direct {v1, p0, v0}, Ltop/suzhelan/qstory/hook/item/chat/PreventRetractingMessage$initializeStorage$1;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-static {p1, v0, v0, v1, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 p0, 0x8f5

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    const/16 p1, 0x8f6

    .line 48
    .line 49
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/16 v0, 0x8f9

    .line 54
    .line 55
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    new-instance p1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x567

    .line 68
    .line 69
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    sput-object p1, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 73
    .line 74
    const/16 p1, 0x67d

    .line 75
    .line 76
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/16 v0, 0x67e

    .line 85
    .line 86
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-class v1, Ljava/lang/String;

    .line 95
    .line 96
    const-class v2, [B

    .line 97
    .line 98
    filled-new-array {v1, v2, v0}, [Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    const/16 v0, 0x67f

    .line 106
    .line 107
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 120
    .line 121
    const/4 v1, 0x7

    .line 122
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 126
    .line 127
    .line 128
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 129
    .line 130
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 131
    .line 132
    const/4 v0, 0x1

    .line 133
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;I)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x8f8

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 0

    .line 1
    new-instance p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x7e6

    .line 14
    .line 15
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    filled-new-array {v4, v4}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, -0x2

    .line 33
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    filled-new-array {v5, v5}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-static {v5, v4, v3}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/16 v4, 0x7e7

    .line 46
    .line 47
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast v3, Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    const/16 v4, 0x7e8

    .line 56
    .line 57
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v3, v4, v5}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/16 v4, 0x7e9

    .line 69
    .line 70
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v3, v4, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/16 v1, 0x7ea

    .line 82
    .line 83
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v3, v1, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const/16 v4, 0x8fa

    .line 105
    .line 106
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5"

    .line 117
    .line 118
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 133
    .line 134
    invoke-virtual {v1, p0}, Landroid/view/View;->setId(I)V

    .line 135
    .line 136
    .line 137
    const/16 p0, 0x11

    .line 138
    .line 139
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 140
    .line 141
    .line 142
    const/high16 p0, 0x41600000    # 14.0f

    .line 143
    .line 144
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 145
    .line 146
    .line 147
    const p0, 0x24060001

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, p0}, Landroid/content/Context;->getColor(I)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    invoke-virtual {v1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method
