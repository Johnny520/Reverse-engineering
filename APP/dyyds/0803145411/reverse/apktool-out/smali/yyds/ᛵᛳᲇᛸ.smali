.class public final Lyyds/ᛵᛳᲇᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᲈᲇ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛸᲀᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛳᲇᛸ;->ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected cancel"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛲᛴᛳᛲ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛲᲈᲁ()Lyyds/ᲀᲈᲇ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected retry"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᲈᛷᛲᛱ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "already connected"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᲈᛷᛲᛱ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "already connected"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛳᲇᛸ;->ᛲᲈᲁ:Lyyds/ᲈᛸᲀᛸ;

    .line 2
    .line 3
    return-object p0
.end method
