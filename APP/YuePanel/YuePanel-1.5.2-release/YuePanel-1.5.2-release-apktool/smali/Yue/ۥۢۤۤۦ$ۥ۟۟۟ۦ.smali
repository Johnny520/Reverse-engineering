.class public LYue/ۥۢۤۤۦ$ۥ۟۟۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۤۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/View;LYue/ۥۢۤۤۦ$ۥ۟۟۠ۤ;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۤۤۦ$ۥ۟۟۠ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۤۨ:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۤۨ:I

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LYue/ۥۢۤۤۧ;

    invoke-direct {v1, p1}, LYue/ۥۢۤۤۧ;-><init>(LYue/ۥۢۤۤۦ$ۥ۟۟۠ۤ;)V

    invoke-virtual {v0, p1, v1}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Landroid/view/View;->addOnUnhandledKeyEventListener(Landroid/view/View$OnUnhandledKeyEventListener;)V

    return-void
.end method

.method public static ۥ۟(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getAccessibilityPaneTitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/view/View;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->isAccessibilityHeading()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/view/View;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->isScreenReaderFocusable()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/view/View;LYue/ۥۢۤۤۦ$ۥ۟۟۠ۤ;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۤۤۦ$ۥ۟۟۠ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۤۨ:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View$OnUnhandledKeyEventListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->removeOnUnhandledKeyEventListener(Landroid/view/View$OnUnhandledKeyEventListener;)V

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/view/View;I)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/view/View;",
            "I)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/View;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityHeading(Z)V

    return-void
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۥۣ۟۟۟(Landroid/view/View;LYue/ۥ۟ۢۤۢ;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LYue/ۥ۟ۢۤۢ;->ۥ()Landroid/view/autofill/AutofillId;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillId(Landroid/view/autofill/AutofillId;)V

    return-void
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/View;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/View;->setScreenReaderFocusable(Z)V

    return-void
.end method
