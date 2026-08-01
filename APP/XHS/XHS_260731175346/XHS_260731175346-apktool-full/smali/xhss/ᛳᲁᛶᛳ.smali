.class public final Lxhss/ᛳᲁᛶᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛸᲁᛶ;


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛲᛷᛷᛵ;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛲᛷᛷᛵ;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lxhss/ᛲᛷᛷᛵ;-><init>(Lxhss/ᛱᛸᲁᛶ;Ljava/lang/Throwable;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛳᲁᛶᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛷᛷᛵ;

    .line 11
    .line 12
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
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲁᛶᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛷᛷᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᲈᲁᛲᲇ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "unexpected call"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
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
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲁᛶᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛷᛷᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
