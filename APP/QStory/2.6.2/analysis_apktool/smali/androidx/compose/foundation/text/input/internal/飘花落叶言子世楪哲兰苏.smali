.class public final Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public final 飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

.field public final 飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

.field public 飘花落叶言子楪苏世兰哲:I

.field public 飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

.field public 飘花落叶言子楪苏兰世哲:Z

.field public 飘花落叶言子楪苏哲世兰:Z

.field public final 飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;ZLandroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 5
    .line 6
    iput-boolean p3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final beginBatchEdit()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    iput v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    return v0
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final closeConnection()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_0
    if-ge v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return p0
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰苏哲;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final endBatchEdit()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final finishComposingText()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(J)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v0, v1

    .line 8
    :goto_0
    iput-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲世兰:Z

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget v1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    .line 15
    .line 16
    :cond_1
    iput v1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 17
    .line 18
    :cond_2
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 19
    .line 20
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;)Landroid/view/inputmethod/ExtractedText;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    iget-wide v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 14
    .line 15
    invoke-static {p0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;)Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 20
    .line 21
    return-object p0
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;I)Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;I)Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final performContextMenuAction(I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return v0

    .line 10
    :pswitch_0
    const/16 p1, 0x117

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 13
    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_1
    const/16 p1, 0x116

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :pswitch_2
    const/16 p1, 0x115

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_3
    new-instance p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 31
    .line 32
    iget-object v1, v1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 33
    .line 34
    iget-object v1, v1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {p1, v0, v1}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performEditorAction(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "IME sends unsupported Editor Action: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "RecordingIC"

    .line 26
    .line 27
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    move p1, v0

    .line 31
    goto :goto_0

    .line 32
    :pswitch_0
    const/4 p1, 0x5

    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    const/4 p1, 0x7

    .line 35
    goto :goto_0

    .line 36
    :pswitch_2
    const/4 p1, 0x6

    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    const/4 p1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :pswitch_4
    const/4 p1, 0x3

    .line 41
    goto :goto_0

    .line 42
    :pswitch_5
    const/4 p1, 0x2

    .line 43
    :goto_0
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 44
    .line 45
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 48
    .line 49
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 50
    .line 51
    new-instance v1, Landroidx/compose/ui/text/input/飘花落叶言子楪苏哲兰世;

    .line 52
    .line 53
    invoke-direct {v1, p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    return v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-lt v3, v4, :cond_31

    .line 12
    .line 13
    new-instance v3, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    invoke-direct {v3, v0, v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    iget-object v5, v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    if-eqz v5, :cond_2e

    .line 24
    .line 25
    iget-object v7, v5, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪苏哲兰世:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    goto/16 :goto_15

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const/4 v9, 0x0

    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    iget-object v8, v8, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 39
    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    iget-object v8, v8, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 43
    .line 44
    if-eqz v8, :cond_1

    .line 45
    .line 46
    iget-object v8, v8, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v8, v9

    .line 50
    :goto_0
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_2

    .line 55
    .line 56
    goto/16 :goto_15

    .line 57
    .line 58
    :cond_2
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const-wide v10, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const/16 v8, 0x20

    .line 68
    .line 69
    const/4 v12, 0x1

    .line 70
    iget-object v13, v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 71
    .line 72
    if-eqz v6, :cond_6

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {v6}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/inputmethod/SelectGesture;)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eq v7, v12, :cond_3

    .line 91
    .line 92
    move v7, v4

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move v7, v12

    .line 95
    :goto_1
    invoke-static {v5, v6, v7}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_4

    .line 104
    .line 105
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    goto/16 :goto_15

    .line 114
    .line 115
    :cond_4
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 116
    .line 117
    shr-long v7, v5, v8

    .line 118
    .line 119
    long-to-int v7, v7

    .line 120
    and-long/2addr v5, v10

    .line 121
    long-to-int v5, v5

    .line 122
    invoke-direct {v0, v7, v5}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    if-eqz v13, :cond_5

    .line 129
    .line 130
    invoke-virtual {v13, v12}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏兰哲世(Z)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_2
    move v6, v12

    .line 134
    goto/16 :goto_15

    .line 135
    .line 136
    :cond_6
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_a

    .line 141
    .line 142
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰(Landroid/view/inputmethod/DeleteGesture;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eq v6, v12, :cond_7

    .line 151
    .line 152
    move v6, v4

    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move v6, v12

    .line 155
    :goto_3
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲兰世(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v8}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-static {v5, v8, v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v8

    .line 167
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    goto/16 :goto_15

    .line 182
    .line 183
    :cond_8
    if-ne v6, v12, :cond_9

    .line 184
    .line 185
    move v0, v12

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move v0, v4

    .line 188
    :goto_4
    invoke-static {v8, v9, v7, v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(JLandroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;ZLandroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_d

    .line 197
    .line 198
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-static {v6}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪哲兰苏(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v7}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-eq v9, v12, :cond_b

    .line 223
    .line 224
    move v9, v4

    .line 225
    goto :goto_5

    .line 226
    :cond_b
    move v9, v12

    .line 227
    :goto_5
    invoke-static {v5, v6, v7, v9}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 228
    .line 229
    .line 230
    move-result-wide v5

    .line 231
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_c

    .line 236
    .line 237
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    goto/16 :goto_15

    .line 246
    .line 247
    :cond_c
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 248
    .line 249
    shr-long v7, v5, v8

    .line 250
    .line 251
    long-to-int v7, v7

    .line 252
    and-long/2addr v5, v10

    .line 253
    long-to-int v5, v5

    .line 254
    invoke-direct {v0, v7, v5}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    if-eqz v13, :cond_5

    .line 261
    .line 262
    invoke-virtual {v13, v12}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏兰哲世(Z)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_2

    .line 266
    .line 267
    :cond_d
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_11

    .line 272
    .line 273
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eq v6, v12, :cond_e

    .line 282
    .line 283
    move v6, v4

    .line 284
    goto :goto_6

    .line 285
    :cond_e
    move v6, v12

    .line 286
    :goto_6
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰世哲(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-static {v8}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-static {v9}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    invoke-static {v5, v8, v9, v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 303
    .line 304
    .line 305
    move-result-wide v8

    .line 306
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_f

    .line 311
    .line 312
    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    goto/16 :goto_15

    .line 321
    .line 322
    :cond_f
    if-ne v6, v12, :cond_10

    .line 323
    .line 324
    move v0, v12

    .line 325
    goto :goto_7

    .line 326
    :cond_10
    move v0, v4

    .line 327
    :goto_7
    invoke-static {v8, v9, v7, v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(JLandroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;ZLandroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :cond_11
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    const/4 v10, 0x2

    .line 337
    const/high16 v11, 0x40000000    # 2.0f

    .line 338
    .line 339
    const/4 v13, -0x1

    .line 340
    iget-object v0, v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 341
    .line 342
    if-eqz v6, :cond_1d

    .line 343
    .line 344
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    if-nez v0, :cond_12

    .line 349
    .line 350
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    goto/16 :goto_15

    .line 359
    .line 360
    :cond_12
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-static {v9}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/graphics/PointF;)J

    .line 365
    .line 366
    .line 367
    move-result-wide v14

    .line 368
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    if-eqz v9, :cond_15

    .line 373
    .line 374
    iget-object v9, v9, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 375
    .line 376
    if-eqz v9, :cond_15

    .line 377
    .line 378
    iget-object v9, v9, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 379
    .line 380
    move/from16 v16, v8

    .line 381
    .line 382
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    if-eqz v8, :cond_14

    .line 387
    .line 388
    invoke-interface {v8, v14, v15}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v14

    .line 392
    invoke-static {v9, v14, v15, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;JLandroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-ne v0, v13, :cond_13

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_13
    invoke-virtual {v9, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(I)F

    .line 400
    .line 401
    .line 402
    move-result v8

    .line 403
    invoke-virtual {v9, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(I)F

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    add-float/2addr v0, v8

    .line 408
    div-float/2addr v0, v11

    .line 409
    invoke-static {v14, v15, v0, v12}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(JFI)J

    .line 410
    .line 411
    .line 412
    move-result-wide v14

    .line 413
    invoke-virtual {v9, v14, v15}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    goto :goto_9

    .line 418
    :cond_14
    :goto_8
    move v0, v13

    .line 419
    goto :goto_9

    .line 420
    :cond_15
    move/from16 v16, v8

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :goto_9
    if-eq v0, v13, :cond_1c

    .line 424
    .line 425
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    if-eqz v5, :cond_16

    .line 430
    .line 431
    iget-object v5, v5, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 432
    .line 433
    if-eqz v5, :cond_16

    .line 434
    .line 435
    invoke-static {v5, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;I)Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-ne v5, v12, :cond_16

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_16
    move v5, v0

    .line 443
    :goto_a
    if-lez v5, :cond_18

    .line 444
    .line 445
    invoke-static {v7, v5}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 450
    .line 451
    .line 452
    move-result v8

    .line 453
    if-nez v8, :cond_17

    .line 454
    .line 455
    goto :goto_b

    .line 456
    :cond_17
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    sub-int/2addr v5, v6

    .line 461
    goto :goto_a

    .line 462
    :cond_18
    :goto_b
    invoke-virtual {v7}, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->length()I

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    if-ge v0, v6, :cond_1a

    .line 467
    .line 468
    invoke-static {v7, v0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-nez v8, :cond_19

    .line 477
    .line 478
    goto :goto_c

    .line 479
    :cond_19
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    add-int/2addr v0, v6

    .line 484
    goto :goto_b

    .line 485
    :cond_1a
    :goto_c
    invoke-static {v5, v0}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 486
    .line 487
    .line 488
    move-result-wide v5

    .line 489
    invoke-static {v5, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_1b

    .line 494
    .line 495
    shr-long v5, v5, v16

    .line 496
    .line 497
    long-to-int v0, v5

    .line 498
    new-instance v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 499
    .line 500
    invoke-direct {v5, v0, v0}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 504
    .line 505
    const-string v6, " "

    .line 506
    .line 507
    invoke-direct {v0, v6, v12}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 508
    .line 509
    .line 510
    new-array v6, v10, [Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 511
    .line 512
    aput-object v5, v6, v4

    .line 513
    .line 514
    aput-object v0, v6, v12

    .line 515
    .line 516
    new-instance v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;

    .line 517
    .line 518
    invoke-direct {v0, v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;-><init>([Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    goto/16 :goto_2

    .line 525
    .line 526
    :cond_1b
    invoke-static {v5, v6, v7, v4, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(JLandroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;ZLandroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)V

    .line 527
    .line 528
    .line 529
    goto/16 :goto_2

    .line 530
    .line 531
    :cond_1c
    :goto_d
    invoke-static {v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 536
    .line 537
    .line 538
    move-result v6

    .line 539
    goto/16 :goto_15

    .line 540
    .line 541
    :cond_1d
    move/from16 v16, v8

    .line 542
    .line 543
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v6

    .line 547
    if-eqz v6, :cond_23

    .line 548
    .line 549
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    if-nez v0, :cond_1e

    .line 554
    .line 555
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    goto/16 :goto_15

    .line 564
    .line 565
    :cond_1e
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-static {v7}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/graphics/PointF;)J

    .line 570
    .line 571
    .line 572
    move-result-wide v7

    .line 573
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    if-eqz v9, :cond_20

    .line 578
    .line 579
    iget-object v9, v9, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 580
    .line 581
    if-eqz v9, :cond_20

    .line 582
    .line 583
    iget-object v9, v9, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 584
    .line 585
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 586
    .line 587
    .line 588
    move-result-object v14

    .line 589
    if-eqz v14, :cond_20

    .line 590
    .line 591
    invoke-interface {v14, v7, v8}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(J)J

    .line 592
    .line 593
    .line 594
    move-result-wide v7

    .line 595
    invoke-static {v9, v7, v8, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;JLandroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-ne v0, v13, :cond_1f

    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1f
    invoke-virtual {v9, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(I)F

    .line 603
    .line 604
    .line 605
    move-result v14

    .line 606
    invoke-virtual {v9, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(I)F

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    add-float/2addr v0, v14

    .line 611
    div-float/2addr v0, v11

    .line 612
    invoke-static {v7, v8, v0, v12}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(JFI)J

    .line 613
    .line 614
    .line 615
    move-result-wide v7

    .line 616
    invoke-virtual {v9, v7, v8}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    goto :goto_f

    .line 621
    :cond_20
    :goto_e
    move v0, v13

    .line 622
    :goto_f
    if-eq v0, v13, :cond_22

    .line 623
    .line 624
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 625
    .line 626
    .line 627
    move-result-object v5

    .line 628
    if-eqz v5, :cond_21

    .line 629
    .line 630
    iget-object v5, v5, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 631
    .line 632
    if-eqz v5, :cond_21

    .line 633
    .line 634
    invoke-static {v5, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;I)Z

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    if-ne v5, v12, :cond_21

    .line 639
    .line 640
    goto :goto_10

    .line 641
    :cond_21
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v5

    .line 645
    new-instance v6, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 646
    .line 647
    invoke-direct {v6, v0, v0}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 648
    .line 649
    .line 650
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 651
    .line 652
    invoke-direct {v0, v5, v12}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 653
    .line 654
    .line 655
    new-array v5, v10, [Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 656
    .line 657
    aput-object v6, v5, v4

    .line 658
    .line 659
    aput-object v0, v5, v12

    .line 660
    .line 661
    new-instance v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;

    .line 662
    .line 663
    invoke-direct {v0, v5}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;-><init>([Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    goto/16 :goto_2

    .line 670
    .line 671
    :cond_22
    :goto_10
    invoke-static {v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 676
    .line 677
    .line 678
    move-result v6

    .line 679
    goto/16 :goto_15

    .line 680
    .line 681
    :cond_23
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    if-eqz v6, :cond_2d

    .line 686
    .line 687
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 688
    .line 689
    .line 690
    move-result-object v6

    .line 691
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    if-eqz v8, :cond_24

    .line 696
    .line 697
    iget-object v9, v8, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 698
    .line 699
    :cond_24
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    invoke-static {v8}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/graphics/PointF;)J

    .line 704
    .line 705
    .line 706
    move-result-wide v14

    .line 707
    invoke-static {v6}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪哲苏兰(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    .line 708
    .line 709
    .line 710
    move-result-object v8

    .line 711
    move/from16 v17, v11

    .line 712
    .line 713
    invoke-static {v8}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/graphics/PointF;)J

    .line 714
    .line 715
    .line 716
    move-result-wide v10

    .line 717
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    if-eqz v9, :cond_29

    .line 722
    .line 723
    iget-object v8, v9, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 724
    .line 725
    if-nez v5, :cond_25

    .line 726
    .line 727
    goto :goto_12

    .line 728
    :cond_25
    invoke-interface {v5, v14, v15}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(J)J

    .line 729
    .line 730
    .line 731
    move-result-wide v14

    .line 732
    invoke-interface {v5, v10, v11}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(J)J

    .line 733
    .line 734
    .line 735
    move-result-wide v9

    .line 736
    invoke-static {v8, v14, v15, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;JLandroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)I

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    invoke-static {v8, v9, v10, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;JLandroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)I

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    if-ne v5, v13, :cond_26

    .line 745
    .line 746
    if-ne v0, v13, :cond_28

    .line 747
    .line 748
    sget-wide v8, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 749
    .line 750
    goto :goto_13

    .line 751
    :cond_26
    if-ne v0, v13, :cond_27

    .line 752
    .line 753
    goto :goto_11

    .line 754
    :cond_27
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    :goto_11
    move v0, v5

    .line 759
    :cond_28
    invoke-virtual {v8, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(I)F

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    invoke-virtual {v8, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(I)F

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    add-float/2addr v0, v5

    .line 768
    div-float v0, v0, v17

    .line 769
    .line 770
    new-instance v5, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 771
    .line 772
    shr-long v14, v14, v16

    .line 773
    .line 774
    long-to-int v11, v14

    .line 775
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 776
    .line 777
    .line 778
    move-result v14

    .line 779
    shr-long v9, v9, v16

    .line 780
    .line 781
    long-to-int v9, v9

    .line 782
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 783
    .line 784
    .line 785
    move-result v10

    .line 786
    invoke-static {v14, v10}, Ljava/lang/Math;->min(FF)F

    .line 787
    .line 788
    .line 789
    move-result v10

    .line 790
    const v14, 0x3dcccccd    # 0.1f

    .line 791
    .line 792
    .line 793
    sub-float v15, v0, v14

    .line 794
    .line 795
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 796
    .line 797
    .line 798
    move-result v11

    .line 799
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 800
    .line 801
    .line 802
    move-result v9

    .line 803
    invoke-static {v11, v9}, Ljava/lang/Math;->max(FF)F

    .line 804
    .line 805
    .line 806
    move-result v9

    .line 807
    add-float/2addr v0, v14

    .line 808
    invoke-direct {v5, v10, v15, v9, v0}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 809
    .line 810
    .line 811
    sget-object v0, Landroidx/compose/ui/text/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏兰楪哲;

    .line 812
    .line 813
    invoke-virtual {v8, v5, v4, v0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;ILandroidx/compose/ui/text/飘花落叶言子世苏兰楪哲;)J

    .line 814
    .line 815
    .line 816
    move-result-wide v8

    .line 817
    goto :goto_13

    .line 818
    :cond_29
    :goto_12
    sget-wide v8, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 819
    .line 820
    :goto_13
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    if-eqz v0, :cond_2a

    .line 825
    .line 826
    invoke-static {v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 831
    .line 832
    .line 833
    move-result v6

    .line 834
    goto/16 :goto_15

    .line 835
    .line 836
    :cond_2a
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 837
    .line 838
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 839
    .line 840
    .line 841
    iput v13, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 842
    .line 843
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    .line 844
    .line 845
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 846
    .line 847
    .line 848
    iput v13, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 849
    .line 850
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(J)I

    .line 851
    .line 852
    .line 853
    move-result v10

    .line 854
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(J)I

    .line 855
    .line 856
    .line 857
    move-result v11

    .line 858
    invoke-virtual {v7, v10, v11}, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 859
    .line 860
    .line 861
    move-result-object v7

    .line 862
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v7

    .line 866
    new-instance v10, Lkotlin/text/Regex;

    .line 867
    .line 868
    const-string v11, "\\s+"

    .line 869
    .line 870
    invoke-direct {v10, v11}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    new-instance v11, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 874
    .line 875
    const/16 v14, 0xe

    .line 876
    .line 877
    invoke-direct {v11, v0, v14, v5}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v10, v7, v11}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v7

    .line 884
    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 885
    .line 886
    if-eq v0, v13, :cond_2c

    .line 887
    .line 888
    iget v10, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 889
    .line 890
    if-ne v10, v13, :cond_2b

    .line 891
    .line 892
    goto :goto_14

    .line 893
    :cond_2b
    shr-long v13, v8, v16

    .line 894
    .line 895
    long-to-int v6, v13

    .line 896
    add-int v11, v6, v0

    .line 897
    .line 898
    add-int/2addr v6, v10

    .line 899
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 900
    .line 901
    .line 902
    move-result v10

    .line 903
    invoke-static {v8, v9}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲(J)I

    .line 904
    .line 905
    .line 906
    move-result v8

    .line 907
    iget v5, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 908
    .line 909
    sub-int/2addr v8, v5

    .line 910
    sub-int/2addr v10, v8

    .line 911
    invoke-virtual {v7, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    new-instance v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 916
    .line 917
    invoke-direct {v5, v11, v6}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 918
    .line 919
    .line 920
    new-instance v6, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 921
    .line 922
    invoke-direct {v6, v0, v12}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 923
    .line 924
    .line 925
    const/4 v0, 0x2

    .line 926
    new-array v0, v0, [Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 927
    .line 928
    aput-object v5, v0, v4

    .line 929
    .line 930
    aput-object v6, v0, v12

    .line 931
    .line 932
    new-instance v5, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;

    .line 933
    .line 934
    invoke-direct {v5, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;-><init>([Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v3, v5}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    goto/16 :goto_2

    .line 941
    .line 942
    :cond_2c
    :goto_14
    invoke-static {v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-static {v0, v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I

    .line 947
    .line 948
    .line 949
    move-result v6

    .line 950
    goto :goto_15

    .line 951
    :cond_2d
    move v0, v10

    .line 952
    move v6, v0

    .line 953
    :cond_2e
    :goto_15
    if-nez v2, :cond_2f

    .line 954
    .line 955
    goto :goto_16

    .line 956
    :cond_2f
    if-eqz v1, :cond_30

    .line 957
    .line 958
    new-instance v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;

    .line 959
    .line 960
    invoke-direct {v0, v2, v6, v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;II)V

    .line 961
    .line 962
    .line 963
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 964
    .line 965
    .line 966
    return-void

    .line 967
    :cond_30
    invoke-interface {v2, v6}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 968
    .line 969
    .line 970
    :cond_31
    :goto_16
    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    :cond_0
    return p0
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_14

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 9
    .line 10
    if-eqz v0, :cond_14

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪苏哲兰世:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v3, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-object v3, v3, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-object v3, v3, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_0
    invoke-virtual {v1, v3}, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_2
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p0, :cond_12

    .line 58
    .line 59
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/inputmethod/SelectGesture;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eq p1, v3, :cond_3

    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p1, v3

    .line 76
    :goto_1
    invoke-static {v0, v1, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰哲苏(J)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    sget-wide v4, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 92
    .line 93
    invoke-virtual {p1, v4, v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(J)V

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_12

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 103
    .line 104
    .line 105
    sget-object p1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_6
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_a

    .line 117
    .line 118
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p0, :cond_12

    .line 123
    .line 124
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Landroid/view/inputmethod/DeleteGesture;)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eq p1, v3, :cond_7

    .line 137
    .line 138
    move p1, v2

    .line 139
    goto :goto_2

    .line 140
    :cond_7
    move p1, v3

    .line 141
    :goto_2
    invoke-static {v0, v1, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(J)V

    .line 150
    .line 151
    .line 152
    :cond_8
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 153
    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    sget-wide v4, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 157
    .line 158
    invoke-virtual {p1, v4, v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰哲苏(J)V

    .line 159
    .line 160
    .line 161
    :cond_9
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_12

    .line 166
    .line 167
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 168
    .line 169
    .line 170
    sget-object p1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_5

    .line 176
    .line 177
    :cond_a
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p0, :cond_12

    .line 188
    .line 189
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪哲兰苏(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v4}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Landroid/view/inputmethod/SelectRangeGesture;)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eq p1, v3, :cond_b

    .line 210
    .line 211
    move p1, v2

    .line 212
    goto :goto_3

    .line 213
    :cond_b
    move p1, v3

    .line 214
    :goto_3
    invoke-static {v0, v1, v4, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 219
    .line 220
    if-eqz p1, :cond_c

    .line 221
    .line 222
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰哲苏(J)V

    .line 223
    .line 224
    .line 225
    :cond_c
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 226
    .line 227
    if-eqz p1, :cond_d

    .line 228
    .line 229
    sget-wide v4, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 230
    .line 231
    invoke-virtual {p1, v4, v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(J)V

    .line 232
    .line 233
    .line 234
    :cond_d
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-nez p1, :cond_12

    .line 239
    .line 240
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 241
    .line 242
    .line 243
    sget-object p1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 244
    .line 245
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_e
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_14

    .line 254
    .line 255
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-eqz p0, :cond_12

    .line 260
    .line 261
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰苏世哲(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-static {v4}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪兰苏哲(Landroid/graphics/RectF;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {p1}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/view/inputmethod/DeleteRangeGesture;)I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    if-eq p1, v3, :cond_f

    .line 282
    .line 283
    move p1, v2

    .line 284
    goto :goto_4

    .line 285
    :cond_f
    move p1, v3

    .line 286
    :goto_4
    invoke-static {v0, v1, v4, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 291
    .line 292
    if-eqz p1, :cond_10

    .line 293
    .line 294
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(J)V

    .line 295
    .line 296
    .line 297
    :cond_10
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 298
    .line 299
    if-eqz p1, :cond_11

    .line 300
    .line 301
    sget-wide v4, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 302
    .line 303
    invoke-virtual {p1, v4, v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰哲苏(J)V

    .line 304
    .line 305
    .line 306
    :cond_11
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-nez p1, :cond_12

    .line 311
    .line 312
    invoke-virtual {p0, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子世楪哲苏兰(Z)V

    .line 313
    .line 314
    .line 315
    sget-object p1, Landroidx/compose/foundation/text/HandleState;->None:Landroidx/compose/foundation/text/HandleState;

    .line 316
    .line 317
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰哲苏世(Landroidx/compose/foundation/text/HandleState;)V

    .line 318
    .line 319
    .line 320
    :cond_12
    :goto_5
    if-eqz p2, :cond_13

    .line 321
    .line 322
    new-instance p1, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰苏世;

    .line 323
    .line 324
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰苏世;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 328
    .line 329
    .line 330
    :cond_13
    return v3

    .line 331
    :cond_14
    :goto_6
    return v2
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final requestCursorUpdates(I)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    and-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    move v3, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v3, v1

    .line 21
    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v5, 0x21

    .line 24
    .line 25
    if-lt v4, v5, :cond_8

    .line 26
    .line 27
    and-int/lit8 v5, p1, 0x10

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    move v5, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v5, v1

    .line 34
    :goto_2
    and-int/lit8 v6, p1, 0x8

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    move v6, v2

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move v6, v1

    .line 41
    :goto_3
    and-int/lit8 v7, p1, 0x4

    .line 42
    .line 43
    if-eqz v7, :cond_4

    .line 44
    .line 45
    move v7, v2

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    move v7, v1

    .line 48
    :goto_4
    const/16 v8, 0x22

    .line 49
    .line 50
    if-lt v4, v8, :cond_5

    .line 51
    .line 52
    and-int/lit8 p1, p1, 0x20

    .line 53
    .line 54
    if-eqz p1, :cond_5

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_5
    if-nez v5, :cond_7

    .line 58
    .line 59
    if-nez v6, :cond_7

    .line 60
    .line 61
    if-nez v7, :cond_7

    .line 62
    .line 63
    if-nez v1, :cond_7

    .line 64
    .line 65
    if-lt v4, v8, :cond_6

    .line 66
    .line 67
    move p1, v2

    .line 68
    move v1, p1

    .line 69
    :goto_5
    move v5, v1

    .line 70
    :goto_6
    move v6, v5

    .line 71
    goto :goto_7

    .line 72
    :cond_6
    move p1, v1

    .line 73
    move v1, v2

    .line 74
    goto :goto_5

    .line 75
    :cond_7
    move p1, v1

    .line 76
    move v1, v7

    .line 77
    goto :goto_7

    .line 78
    :cond_8
    move p1, v1

    .line 79
    move v5, v2

    .line 80
    goto :goto_6

    .line 81
    :goto_7
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 82
    .line 83
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 86
    .line 87
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世苏兰:Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;

    .line 88
    .line 89
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v4

    .line 92
    :try_start_0
    iput-boolean v5, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰哲苏:Z

    .line 93
    .line 94
    iput-boolean v6, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 95
    .line 96
    iput-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世兰哲:Z

    .line 97
    .line 98
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰:Z

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    iput-boolean v2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Z

    .line 103
    .line 104
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲兰世:Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰()V

    .line 109
    .line 110
    .line 111
    goto :goto_8

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    :goto_8
    iput-boolean v3, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    monitor-exit v4

    .line 117
    return v2

    .line 118
    :goto_9
    monitor-exit v4

    .line 119
    throw p0

    .line 120
    :cond_a
    return v0
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏兰世哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/view/inputmethod/BaseInputConnection;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return v0
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰世哲苏;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰世哲苏;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return v0
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return v0
.end method

.method public final setSelection(II)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏兰世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    return v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/KeyEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/view/KeyEvent;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 23
    .line 24
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-interface {v2, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 37
    .line 38
    if-lez p0, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲()Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲()Z

    .line 18
    .line 19
    .line 20
    throw p1
.end method
