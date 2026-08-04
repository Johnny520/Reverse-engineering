.class public final Lyyds/ᛸᛶᲁᛶ;
.super Lyyds/ᛱᛱᲁᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛲᲈᲈ:Lyyds/ᲀᛱᛵᛶ;

.field public final synthetic ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲈᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᛱᛵᛶ;Lyyds/ᲀᛱᛵᛶ;Lyyds/ᲈᛱᲈᛵ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛸᛶᲁᛶ;->ᛲᛲᲈᲈ:Lyyds/ᲀᛱᛵᛶ;

    .line 2
    .line 3
    iput-object p3, p0, Lyyds/ᛸᛶᲁᛶ;->ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲈᛵ;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lyyds/ᛱᛱᲁᛴ;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()Lyyds/ᛴᛸᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛶᲁᛶ;->ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲈᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛶᲁᛶ;->ᛲᛲᲈᲈ:Lyyds/ᲀᛱᛵᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᛱᛵᛶ;->getInternalPopup()Lyyds/ᛸᛱᲈᛵ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lyyds/ᛸᛱᲈᛵ;->ᛲᲈᲁ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᲀᛱᛵᛶ;->ᛱᲈᲁ:Lyyds/ᛸᛱᲈᛵ;

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛱᛷᛵᛷ;->ᛵᛸᛸᛷ(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p0}, Lyyds/ᛱᛷᛵᛷ;->ᛲᲈᲁ(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-interface {v0, v1, p0}, Lyyds/ᛸᛱᲈᛵ;->ᛷᛲᲈᛱ(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method
