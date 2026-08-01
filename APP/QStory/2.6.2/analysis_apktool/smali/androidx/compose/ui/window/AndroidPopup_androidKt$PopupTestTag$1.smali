.class final Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$tag:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$$changed:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 103
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 5

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$tag:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget p0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;->$$changed:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    or-int/2addr p0, v1

    .line 9
    invoke-static {p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪苏哲(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget-object v2, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 14
    .line 15
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 16
    .line 17
    const v2, 0x50ea043d

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v2, p0, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v2, p0

    .line 39
    :goto_1
    and-int/lit8 v3, p0, 0x30

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    const/16 v3, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v3, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v3

    .line 55
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 56
    .line 57
    const/16 v4, 0x12

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    :goto_3
    and-int/lit8 v3, v2, 0x1

    .line 64
    .line 65
    invoke-virtual {p1, v3, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    sget-object v1, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 72
    .line 73
    invoke-virtual {v1, p2}, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    and-int/lit8 v2, v2, 0x70

    .line 78
    .line 79
    const/16 v3, 0x8

    .line 80
    .line 81
    or-int/2addr v2, v3

    .line 82
    invoke-static {v1, v0, p1, v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Landroidx/appcompat/widget/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 87
    .line 88
    .line 89
    :goto_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    new-instance v1, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;

    .line 96
    .line 97
    invoke-direct {v1, p2, v0, p0}, Landroidx/compose/ui/window/AndroidPopup_androidKt$PopupTestTag$1;-><init>(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 101
    .line 102
    :cond_6
    return-void
.end method
