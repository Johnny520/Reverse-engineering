.class public Lyyds/ᛱᛵᲈᲈ;
.super Lyyds/ᛶᛸᲈᲈ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛲᲈᲈ:I


# direct methods
.method public constructor <init>(Lyyds/ᛶᲀᲁᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᛶᛸᲈᲈ;-><init>(Lyyds/ᛶᲀᲁᛱ;)V

    .line 2
    .line 3
    .line 4
    instance-of p1, p1, Lyyds/ᛸᛸᛱᛸ;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    iput p1, p0, Lyyds/ᛶᛸᲈᲈ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p1, 0x3

    .line 13
    iput p1, p0, Lyyds/ᛶᛸᲈᲈ;->ᛲᛴᛳᛲ:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᛸᲈᲈ;->ᛷᲈᲈᲁ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛶᛸᲈᲈ;->ᛷᲈᲈᲁ:Z

    .line 8
    .line 9
    iput p1, p0, Lyyds/ᛶᛸᲈᲈ;->ᛶᛷᛲᲁ:I

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛶᛸᲈᲈ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lyyds/ᲁᛸᲀᛴ;

    .line 28
    .line 29
    invoke-interface {p1, p1}, Lyyds/ᲁᛸᲀᛴ;->ᛲᲈᲁ(Lyyds/ᲁᛸᲀᛴ;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    return-void
.end method
