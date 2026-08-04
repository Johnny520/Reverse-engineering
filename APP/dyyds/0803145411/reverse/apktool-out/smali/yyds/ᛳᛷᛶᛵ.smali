.class public final Lyyds/ᛳᛷᛶᛵ;
.super Lyyds/ᛷᲁᲀᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

.field public final synthetic ᛷᛵᲇᲀ:I


# direct methods
.method public constructor <init>(Lyyds/ᛶᛴᛲᛸ;Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛳᛷᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 50
    iput-object p1, p0, Lyyds/ᛳᛷᛶᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

    const v6, 0x66040022

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 51
    invoke-direct/range {v1 .. v7}, Lyyds/ᛷᲁᲀᛸ;-><init>(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;Landroid/view/View;ZII)V

    const p0, 0x800005

    .line 52
    iput p0, v1, Lyyds/ᛷᲁᲀᛸ;->ᲇᲇᲇᛱ:I

    .line 53
    iget-object p0, p1, Lyyds/ᛶᛴᛲᛸ;->ᲈᲀᛲᲀ:Lyyds/ᛱᛱᛴ;

    .line 54
    iput-object p0, v1, Lyyds/ᛷᲁᲀᛸ;->ᛱᲈᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 55
    iget-object p1, v1, Lyyds/ᛷᲁᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲁᲇᲈᲈ;

    if-eqz p1, :cond_0

    .line 56
    invoke-interface {p1, p0}, Lyyds/ᛳᛶᛵᲈ;->ᲇᲈᛵᛷ(Lyyds/ᲇᛲᛸᛶ;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛴᛲᛸ;Landroid/content/Context;Lyyds/ᛵᛱᛴᛲ;Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛳᛷᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛷᛶᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

    .line 5
    .line 6
    const v6, 0x66040022

    .line 7
    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p4

    .line 15
    invoke-direct/range {v1 .. v7}, Lyyds/ᛷᲁᲀᛸ;-><init>(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;Landroid/view/View;ZII)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v3, Lyyds/ᛵᛱᛴᛲ;->ᛱᛳᛶᛳ:Lyyds/ᛵᛷᛸᲈ;

    .line 19
    .line 20
    iget p0, p0, Lyyds/ᛵᛷᛸᲈ;->ᛵᲀᛵᛸ:I

    .line 21
    .line 22
    const/16 p2, 0x20

    .line 23
    .line 24
    and-int/2addr p0, p2

    .line 25
    if-ne p0, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p1, Lyyds/ᛶᛴᛲᛸ;->ᛷᛲᲈᛱ:Lyyds/ᛴᲇᛵᛸ;

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    iget-object p0, p1, Lyyds/ᛶᛴᛲᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛳᲀᛱᛱ;

    .line 33
    .line 34
    check-cast p0, Landroid/view/View;

    .line 35
    .line 36
    :cond_1
    iput-object p0, v1, Lyyds/ᛷᲁᲀᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    iget-object p0, p1, Lyyds/ᛶᛴᛲᛸ;->ᲈᲀᛲᲀ:Lyyds/ᛱᛱᛴ;

    .line 39
    .line 40
    iput-object p0, v1, Lyyds/ᛷᲁᲀᛸ;->ᛱᲈᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 41
    .line 42
    iget-object p1, v1, Lyyds/ᛷᲁᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᲁᲇᲈᲈ;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, p0}, Lyyds/ᛳᛶᛵᲈ;->ᲇᲈᛵᛷ(Lyyds/ᲇᛲᛸᛶ;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method


# virtual methods
.method public final ᲀᛲᛳᲀ()V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛶᛵ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛳᛷᛶᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v2, Lyyds/ᛶᛴᛲᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v3}, Lyyds/ᛴᛴᛵᛸ;->ᲀᛲᛳᲀ(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object v1, v2, Lyyds/ᛶᛴᛲᛸ;->ᛶᲈᛴᲈ:Lyyds/ᛳᛷᛶᛵ;

    .line 18
    .line 19
    invoke-super {p0}, Lyyds/ᛷᲁᲀᛸ;->ᲀᛲᛳᲀ()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iput-object v1, v2, Lyyds/ᛶᛴᛲᛸ;->ᛶᛸᲀᲁ:Lyyds/ᛳᛷᛶᛵ;

    .line 24
    .line 25
    invoke-super {p0}, Lyyds/ᛷᲁᲀᛸ;->ᲀᛲᛳᲀ()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
