.class public final Lyyds/ᛳᛶᛳᲁ;
.super Lyyds/ᛳᛸᲀᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛴᛲᲁᲈ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:[B


# direct methods
.method public constructor <init>(Lyyds/ᛴᛲᲁᲈ;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛶᛳᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛲᲁᲈ;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛳᛶᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛳᛶᛳᲁ;->ᲇᲈᛵᛷ:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()J
    .locals 2

    .line 1
    iget p0, p0, Lyyds/ᛳᛶᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛴᛲᲁᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛶᛳᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛲᲁᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᲇᛲᛴ;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    iget v1, p0, Lyyds/ᛳᛶᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛶᛳᲁ;->ᲇᲈᛵᛷ:[B

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Lyyds/ᛷᛲᲈᛲ;->ᛲᛱᲁᛳ(I[B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "closed"

    .line 19
    .line 20
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
