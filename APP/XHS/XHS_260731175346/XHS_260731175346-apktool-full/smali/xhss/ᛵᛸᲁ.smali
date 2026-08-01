.class public Lxhss/ᛵᛸᲁ;
.super Lxhss/ᛳᛵᲇᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxhss/ᛳᛵᲇᛶ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    .line 11
    .line 12
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    .line 10
    .line 11
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᛲᛱᛶᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    .line 7
    .line 8
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
