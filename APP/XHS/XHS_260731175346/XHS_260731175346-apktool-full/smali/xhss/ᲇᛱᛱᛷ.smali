.class public final Lxhss/ᲇᛱᛱᛷ;
.super Lxhss/ᛵᛷᛸᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛱᛴᲈᛵ;

    .line 5
    .line 6
    sget-object v1, Lxhss/ᛱᛴᲈᛵ;->ᛸᛷᲈᲈ:Lxhss/ᛸᛲᲇᲁ;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lxhss/ᛱᛴᲈᛵ;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᲇᛱᛱᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;

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
    instance-of v0, p1, Lxhss/ᲇᛱᛱᛷ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lxhss/ᲇᛱᛱᛷ;

    .line 8
    .line 9
    iget-object p1, p1, Lxhss/ᲇᛱᛱᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᲇᛱᛱᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;

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
    iget-object p0, p0, Lxhss/ᲇᛱᛱᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;

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

.method public final ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛵᛷᛸᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛱᛱᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᲈᛵ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᛱᛴᲈᛵ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᛵᛷᛸᛶ;

    .line 8
    .line 9
    return-object p0
.end method
