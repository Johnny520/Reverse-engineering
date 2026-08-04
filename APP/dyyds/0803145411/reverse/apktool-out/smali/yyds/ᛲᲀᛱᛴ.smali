.class public abstract Lyyds/ᛲᲀᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛶᛲ;


# instance fields
.field public ᛲᛴᛳᛲ:Lyyds/ᛸᛷᛷᛸ;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lyyds/ᛱᛷᲈᛲ;->ᛷᛵᲇᲀ(II)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lyyds/ᛲᲀᛱᛴ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    iput p2, p0, Lyyds/ᛲᲀᛱᛴ;->ᲇᲈᛵᛷ:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    .line 16
    .line 17
    const-string v0, " and height: "

    .line 18
    .line 19
    invoke-static {p1, p2, p0, v0}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Lyyds/ᛸᛷᛷᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛲᲀᛱᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛷᛷᛸ;

    .line 2
    .line 3
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛲᛷᛶᛸ;)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᲀᛱᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛲᲀᛱᛴ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Lyyds/ᛲᛷᛶᛸ;->ᛲᛲᲈᲈ(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᛵᛸᛸᛷ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᛸᛷᛷᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛷᛷᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᛷᛶᛸ;)V
    .locals 0

    .line 1
    return-void
.end method
