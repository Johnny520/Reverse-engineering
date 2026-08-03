.class public LYue/ۥ۠ۧۡۧ;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# static fields
.field public static ۥ:LYue/ۥ۠ۧۡۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method

.method public static ۥ()LYue/ۥ۠ۧۡۧ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۠ۧۡۧ;->ۥ:LYue/ۥ۠ۧۡۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠ۧۡۧ;

    invoke-direct {v0}, LYue/ۥ۠ۧۡۧ;-><init>()V

    sput-object v0, LYue/ۥ۠ۧۡۧ;->ۥ:LYue/ۥ۠ۧۡۧ;

    :cond_0
    sget-object v0, LYue/ۥ۠ۧۡۧ;->ۥ:LYue/ۥ۠ۧۡۧ;

    return-object v0
.end method


# virtual methods
.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spannable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/view/MotionEvent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۤۡ;
        markerClass = {
            LYue/ۥۣۣ۟ۡ$ۥ۟;
        }
    .end annotation

    invoke-static {}, LYue/ۥۣۣ۟ۡ;->ۥ۟۟۟ۧ()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    if-ltz v1, :cond_2

    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    move-result v3

    if-le v1, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v1

    int-to-float v0, v0

    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v3

    cmpg-float v3, v0, v3

    if-ltz v3, :cond_2

    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    :cond_2
    :goto_0
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    invoke-static {p1, p2, p3}, Landroid/text/method/Touch;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
