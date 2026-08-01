.class public final Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;
.super Landroidx/compose/ui/autofill/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/focus/飘花落叶言子楪苏哲世兰;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪兰哲世苏:Landroidx/collection/飘花落叶言子世楪兰哲苏;

.field public 飘花落叶言子楪兰哲苏世:Z

.field public final 飘花落叶言子楪兰苏世哲:Landroid/graphics/Rect;

.field public final 飘花落叶言子楪兰苏哲世:Landroid/view/autofill/AutofillId;

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰苏世;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰苏世;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-virtual {p3, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iput-object p1, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Landroid/view/autofill/AutofillId;

    .line 32
    .line 33
    new-instance p1, Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 34
    .line 35
    invoke-direct {p1}, Landroidx/collection/飘花落叶言子世楪兰哲苏;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏:Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string p0, "Required value was null."

    .line 42
    .line 43
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 4
    .line 5
    iget v1, p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    new-instance v2, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;

    .line 8
    .line 9
    invoke-direct {v2, p0, p1}, Landroidx/compose/ui/autofill/AndroidAutofillManager$requestAutofill$1;-><init>(Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/semantics/飘花落叶言子楪哲世苏兰;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世()Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 16
    .line 17
    sget-object v1, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :cond_0
    iget p1, p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 36
    .line 37
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    if-eqz p2, :cond_4

    .line 47
    .line 48
    invoke-static {p2}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世()Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iget-object p2, p2, Landroidx/compose/ui/semantics/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 61
    .line 62
    sget-object v0, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    sget-object v0, Landroidx/compose/ui/semantics/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void

    .line 80
    :cond_3
    :goto_0
    iget p1, p1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 81
    .line 82
    iget-object p2, p0, Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;

    .line 83
    .line 84
    iget-object p2, p2, Landroidx/compose/ui/spatial/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 85
    .line 86
    new-instance v0, Landroidx/compose/ui/autofill/AndroidAutofillManager$onFocusChanged$2$1;

    .line 87
    .line 88
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/autofill/AndroidAutofillManager$onFocusChanged$2$1;-><init>(Landroidx/compose/ui/autofill/飘花落叶言子楪世苏兰哲;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v0, p1}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;I)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method
