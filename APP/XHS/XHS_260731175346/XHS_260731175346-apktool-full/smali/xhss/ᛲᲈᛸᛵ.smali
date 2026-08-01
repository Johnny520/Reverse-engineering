.class public abstract Lxhss/ᛲᲈᛸᛵ;
.super Lxhss/ᛲᛱᛱᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲈᛸ;


# direct methods
.method public constructor <init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lxhss/ᛲᛱᛱᛵ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lxhss/ᛲᲈᛸᛵ;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲈᛸ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public ᛱᛱᛲᲇ()Lxhss/ᲀᛳᛲᛶ;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public ᛳᲁᲇᛸ()Lxhss/ᲀᛳᛲᛶ;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ()Lxhss/ᲀᲈᲈᛸ;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛲᲈᛸᛵ;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲈᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v2, v3, v0}, Lxhss/ᲀᲈᲈᛸ;->ᛷᛵᛵᲈ(IIII)Lxhss/ᲀᲈᲈᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lxhss/ᛲᲈᛸᛵ;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᲈᛸ;

    .line 28
    .line 29
    :cond_0
    return-object v0
.end method

.method public ᛸᛶᲈᛶ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->isConsumed()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
