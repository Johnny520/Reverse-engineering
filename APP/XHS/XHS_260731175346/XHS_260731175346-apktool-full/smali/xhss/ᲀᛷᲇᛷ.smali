.class public Lxhss/ᲀᛷᲇᛷ;
.super Lxhss/ᛶᲈᛲᛳ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛸᛴᛶᛳ:Lxhss/ᲀᛳᛲᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lxhss/ᲀᛷᲇᛷ;->ᛸᛴᛶᛳ:Lxhss/ᲀᛳᛲᛶ;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lxhss/ᛶᲈᛲᛳ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public ᛱᛳᲁᲈ(I)Lxhss/ᲀᲈᲈᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lxhss/ᛳᛴᛶᛳ;->ᛷᛵᛵᲈ(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ(Landroid/graphics/Insets;)Lxhss/ᲀᲈᲈᛸ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public ᛳᲈᲈᛲ(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lxhss/ᛳᛴᛶᛳ;->ᛷᛵᛵᲈ(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lxhss/ᛳᛴᛶᛳ;->ᛷᛵᛵᲈ(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ(Landroid/graphics/Insets;)Lxhss/ᲀᲈᲈᛸ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method
