.class public final Lxhss/ᲇᲀᲁᛳ;
.super Landroid/widget/Toast;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲈᲀᛲᛸ;


# instance fields
.field public ᛷᛵᛵᲈ:Landroid/widget/TextView;


# virtual methods
.method public final setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᲇᲀᲁᛳ;->ᛷᛵᛵᲈ:Landroid/widget/TextView;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lxhss/ᲇᲀᲁᛳ;->ᛷᛵᛵᲈ:Landroid/widget/TextView;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {p1}, Lxhss/ᲈᲀᛲᛸ;->ᛷᛵᛵᲈ(Landroid/view/View;)Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lxhss/ᲇᲀᲁᛳ;->ᛷᛵᛵᲈ:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method
