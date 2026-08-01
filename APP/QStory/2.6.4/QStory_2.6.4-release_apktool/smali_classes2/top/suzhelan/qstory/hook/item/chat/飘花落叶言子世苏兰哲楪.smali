.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u54f2\u696a;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "androidx/appcompat/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a",
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


# static fields
.field public static 飘花落叶言子楪兰哲世苏:J


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

.field public final 飘花落叶言子楪兰苏哲世:I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x2399332

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    const/16 v0, 0x1f4

    .line 10
    .line 11
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏哲世:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/16 v0, 0x4cd

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    const/16 v0, 0x915

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p1, v0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    new-instance p1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    const/16 v0, 0xd

    .line 25
    .line 26
    invoke-direct {p1, p0, v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/lang/Thread;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x916

    .line 38
    .line 39
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-class v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 48
    .line 49
    const-class v1, Ljava/util/List;

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    filled-new-array {v2, v0, v1}, [Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/reflect/Method;

    .line 65
    .line 66
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 67
    .line 68
    const/16 v1, 0x9

    .line 69
    .line 70
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 77
    .line 78
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;

    .line 79
    .line 80
    const/4 v0, 0x2

    .line 81
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰苏楪;-><init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x914

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
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
