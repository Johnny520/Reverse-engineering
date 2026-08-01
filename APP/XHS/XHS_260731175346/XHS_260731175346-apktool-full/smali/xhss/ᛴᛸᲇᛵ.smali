.class public final Lxhss/ᛴᛸᲇᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛸᲁᛶ;


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;


# direct methods
.method public constructor <init>(Lxhss/ᲈᲁᛲᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛸᲇᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

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

.method public final ᛱᛱᛲᲇ()Lxhss/ᛲᛷᛷᛵ;
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

.method public final ᛳᲁᲇᛸ()Lxhss/ᲈᲁᛲᲇ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛸᲇᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛱᛸᲁᛶ;
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

.method public final ᲀᲇᛳᲁ()Lxhss/ᛲᛷᛷᛵ;
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

.method public final ᲇᛴᲇᛵ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
