.class public final Lxhss/ᲀᛷᲈᛳ;
.super Lxhss/ᛳᛳᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᲀᲇᛳᲁ:Ljava/lang/String;

.field public ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxhss/ᛳᛳᛵᛱ;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lxhss/ᲀᛷᲈᛳ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p0, p0, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛷᲈᛳ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛴᛷᛱ()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lxhss/ᲀᛷᲈᛳ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lxhss/ᛴᛴᛴᛷ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛱᛸᛳ;

    .line 10
    .line 11
    invoke-virtual {p4, v0, p0, p3}, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛳᛵᛱ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v0, p2, p3, p4}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᲀᲇᛳᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
