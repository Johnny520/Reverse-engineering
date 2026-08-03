.class public final LYue/ۥ۠۠ۦۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/InputFilter;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۦۥ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۦۥ;->ۥ:Landroid/widget/TextView;

    return-void
.end method

.method public static ۥ۟(Landroid/text/Spannable;II)V
    .locals 0

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    invoke-static {p0, p1, p2}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    invoke-static {p0, p1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_0

    :cond_1
    if-ltz p2, :cond_2

    invoke-static {p0, p2}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠ۦۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟۟()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p2, 0x3

    if-eq v0, p2, :cond_5

    return-object p1

    :cond_1
    if-nez p6, :cond_2

    if-nez p5, :cond_2

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-nez p4, :cond_2

    iget-object p4, p0, LYue/ۥ۠۠ۦۥ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p4

    if-ne p1, p4, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_4

    if-nez p2, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ne p3, p4, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    :goto_0
    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p2, p1, p4, p3}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۨ(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_4
    :goto_1
    return-object p1

    :cond_5
    invoke-static {}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟;

    move-result-object p2

    invoke-virtual {p0}, LYue/ۥ۠۠ۦۥ;->ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟ۡ۠(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;)V

    return-object p1
.end method

.method public final ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠ۦۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠۠ۦۥ$ۥ;

    iget-object v1, p0, LYue/ۥ۠۠ۦۥ;->ۥ:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, LYue/ۥ۠۠ۦۥ$ۥ;-><init>(Landroid/widget/TextView;LYue/ۥ۠۠ۦۥ;)V

    iput-object v0, p0, LYue/ۥ۠۠ۦۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۦۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    return-object v0
.end method
