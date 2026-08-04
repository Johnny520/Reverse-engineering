.class public final Lyyds/ᛳᛴᛴ;
.super Lyyds/ᛳᛱᛶᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᛶᲁᛵ;

    .line 5
    .line 6
    sget-object v1, Lyyds/ᛷᛶᲁᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛶᛳᛶᛵ;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lyyds/ᛷᛶᲁᛵ;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lyyds/ᛳᛴᛴ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lyyds/ᛳᛴᛴ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
