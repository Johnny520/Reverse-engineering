.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "androidx/appcompat/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static 飘花落叶言子楪兰哲世苏:J


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

.field public final 飘花落叶言子楪兰苏哲世:I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x2399332

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    const/16 v0, 0x1f4

    .line 10
    .line 11
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰苏哲世:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p1, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    const-wide v0, -0x36a5d0b7051405a7L    # -2.3357539458530944E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    new-instance p1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 29
    .line 30
    const/16 v0, 0xd

    .line 31
    .line 32
    invoke-direct {p1, p0, v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/Thread;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    const-wide v0, -0x36a5d0ba051405a7L    # -2.3357498624646914E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-class v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 57
    .line 58
    const-class v1, Ljava/util/List;

    .line 59
    .line 60
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    filled-new-array {v2, v0, v1}, [Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/reflect/Method;

    .line 74
    .line 75
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 76
    .line 77
    const/16 v1, 0x8

    .line 78
    .line 79
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 86
    .line 87
    new-instance p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;

    .line 88
    .line 89
    const/4 v0, 0x3

    .line 90
    invoke-direct {p1, p0, v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5d0dd051405a7L    # -2.3357022229333224E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
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
