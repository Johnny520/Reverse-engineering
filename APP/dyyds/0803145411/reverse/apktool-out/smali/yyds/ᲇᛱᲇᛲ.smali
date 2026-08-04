.class public Lyyds/ᲇᛱᲇᛲ;
.super Lyyds/ᛸᛱᛵᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛳᛶᲁ:Lyyds/ᲈᛶᲈᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lyyds/ᲇᛱᲇᛲ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᛱᛵᛴ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᲁᛴᲁ;->ᛲᲈᲁ(I)I

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
    invoke-static {p0}, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ(Landroid/graphics/Insets;)Lyyds/ᛸᲀᲁᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public ᛵᲀᛵᛸ(I)Lyyds/ᛸᲀᲁᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᲁᛴᲁ;->ᛲᲈᲁ(I)I

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
    invoke-static {p0}, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ(Landroid/graphics/Insets;)Lyyds/ᛸᲀᲁᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public ᲇᛱᛲ(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᲁᛴᲁ;->ᛲᲈᲁ(I)I

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

.method public final ᲇᲈᛵᛷ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method
