.class public abstract Lyyds/ᛴᛳᛷᛶ;
.super Lyyds/ᲀᛳᲇᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lyyds/ᲀᛳᲇᛱ;-><init>()V

    .line 25
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lyyds/ᛴᛳᛷᛶ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᲀᛳᲇᛱ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    :goto_0
    iput-object v0, p0, Lyyds/ᛴᛳᛷᛶ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets$Builder;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᲀᛳᲇᛱ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛴᛳᛷᛶ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lyyds/ᲈᛲᲁᛳ;->ᛵᛶᛲᲀ([Lyyds/ᛸᲀᲁᛲ;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lyyds/ᲈᛲᲁᛳ;->ᛶᛳᛶᛵ(Lyyds/ᛱᛳᲇᛴ;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lyyds/ᲀᛳᲇᛱ;->ᛲᲈᲁ:[[Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lyyds/ᲈᛲᲁᛳ;->ᛶᲈᛴᲈ([[Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᲀᛳᲇᛱ;->ᛵᛸᛸᛷ:[[Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Lyyds/ᲈᛲᲁᛳ;->ᛶᛸᲀᲁ([[Landroid/graphics/Rect;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public ᲇᲈᛵᛷ(Lyyds/ᛸᲀᲁᛲ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛳᛷᛶ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method
