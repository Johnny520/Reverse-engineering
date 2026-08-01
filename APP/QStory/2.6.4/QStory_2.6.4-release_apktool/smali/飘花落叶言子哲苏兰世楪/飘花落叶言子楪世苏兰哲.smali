.class public final L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, p2, v1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 10
    .line 11
    .line 12
    iput-object p3, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object v0, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 15
    .line 16
    invoke-static {}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Landroid/view/inputmethod/EditorInfo;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method


# virtual methods
.method public final deleteSurroundingText(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, p1, p2, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;Landroid/text/Editable;IIZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p0, v0, p1, p2, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏兰哲;Landroid/text/Editable;IIZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingTextInCodePoints(II)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    return v1
.end method
