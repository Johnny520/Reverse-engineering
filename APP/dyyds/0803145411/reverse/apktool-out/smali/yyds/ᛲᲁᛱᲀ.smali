.class public final Lyyds/ᛲᲁᛱᲀ;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛷᲇᲁ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛲᲁᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lyyds/ᛲᲁᛱᲀ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛲᲁᛱᲀ;->ᛲᲈᲁ()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᲈᛷᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    invoke-virtual {v0}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛳᛶᲁ()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lyyds/ᛴᛴᛵᛸ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget p0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    if-gez p0, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    return v0
.end method

.method public final bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛱᲀ;->ᛵᛸᛸᛷ(I)Lyyds/ᛵᛷᛸᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lyyds/ᛲᲁᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;

    .line 4
    .line 5
    iget-object p2, p2, Lyyds/ᲈᛷᲇᲁ;->ᲇᲈᛵᛷ:Landroid/view/LayoutInflater;

    .line 6
    .line 7
    const v0, 0x660c0010

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_0
    move-object p3, p2

    .line 16
    check-cast p3, Lyyds/ᲇᛶᛸᲈ;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lyyds/ᛲᲁᛱᲀ;->ᛵᛸᛸᛷ(I)Lyyds/ᛵᛷᛸᲈ;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p3, p0}, Lyyds/ᲇᛶᛸᲈ;->ᛲᲈᲁ(Lyyds/ᛵᛷᛸᲈ;)V

    .line 23
    .line 24
    .line 25
    return-object p2
.end method

.method public final notifyDataSetChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᲁᛱᲀ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ᛲᲈᲁ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᲈᛷᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛴᛴᛵᛸ;->ᛲᛶᛱᲈ:Lyyds/ᛵᛷᛸᲈ;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛳᛶᲁ()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᛴᛴᛵᛸ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lyyds/ᛵᛷᛸᲈ;

    .line 26
    .line 27
    if-ne v4, v1, :cond_0

    .line 28
    .line 29
    iput v3, p0, Lyyds/ᛲᲁᛱᲀ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, -0x1

    .line 36
    iput v0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲀᛲᛳᲀ:I

    .line 37
    .line 38
    return-void
.end method

.method public final ᛵᛸᛸᛷ(I)Lyyds/ᛵᛷᛸᲈ;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛷᲇᲁ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᲈᛷᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    invoke-virtual {v0}, Lyyds/ᛴᛴᛵᛸ;->ᛲᛳᛶᲁ()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lyyds/ᛴᛴᛵᛸ;->ᛷᛵᲇᲀ:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget p0, p0, Lyyds/ᛲᲁᛱᲀ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    if-ltz p0, :cond_0

    .line 13
    .line 14
    if-lt p1, p0, :cond_0

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lyyds/ᛵᛷᛸᲈ;

    .line 23
    .line 24
    return-object p0
.end method
