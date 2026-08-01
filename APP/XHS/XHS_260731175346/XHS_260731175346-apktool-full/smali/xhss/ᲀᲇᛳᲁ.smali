.class public abstract Lxhss/ᲀᲇᛳᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛳᛵᲈᛲ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲁᛵᲈ;


# direct methods
.method public constructor <init>(Lxhss/ᲇᲁᛵᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᲇᛳᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᛵᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getKey()Lxhss/ᲇᲁᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᲇᛳᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᲀᲇᛳᲁ;->getKey()Lxhss/ᲇᲁᛵᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget-object p0, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛱᛷᛵᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᲀᲇᛳᲁ;->getKey()Lxhss/ᲇᲁᛵᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method
