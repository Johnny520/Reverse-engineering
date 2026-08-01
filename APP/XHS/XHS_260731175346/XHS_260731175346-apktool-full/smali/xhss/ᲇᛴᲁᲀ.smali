.class public abstract Lxhss/ᲇᛴᲁᲀ;
.super Lxhss/ᛳᛳᛲᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛳᲁᲇᛸ:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxhss/ᛳᛳᛲᲁ;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲇᛴᲁᲀ;->ᛳᲁᲇᛸ:Landroid/view/WindowInsets$Builder;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public ᛱᛱᛲᲇ()Lxhss/ᲀᛳᛲᛶ;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛳᛲᲁ;->ᛷᛵᛵᲈ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᲇᛴᲁᲀ;->ᛳᲁᲇᛸ:Landroid/view/WindowInsets$Builder;

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
    invoke-static {v1, v0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lxhss/ᛵᛸᛱ;->ᛸᛶᛴᲈ([Lxhss/ᲀᲈᲈᛸ;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lxhss/ᛵᛸᛱ;->ᛶᲇᲈᛸ(Lxhss/ᛸᲇᲈᛴ;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lxhss/ᛳᛳᛲᲁ;->ᛷᛵᛵᲈ:[[Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lxhss/ᛵᛸᛱ;->ᛳᛶᛷᲀ([[Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lxhss/ᛳᛳᛲᲁ;->ᛱᛱᛲᲇ:[[Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Lxhss/ᛵᛸᛱ;->ᲁᛲᛴᛴ([[Landroid/graphics/Rect;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
