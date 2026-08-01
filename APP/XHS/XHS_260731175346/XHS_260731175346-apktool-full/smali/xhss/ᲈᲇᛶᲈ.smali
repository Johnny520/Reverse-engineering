.class public final Lxhss/ᲈᲇᛶᲈ;
.super Lxhss/ᲈᲈᛱᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public final synthetic ᛷᛴᛷᛱ:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᲈᲇᛶᲈ;->ᛷᛴᛷᛱ:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lxhss/ᛸᛴᛳᛷ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxhss/ᛲᛸᲁᲇ;

    .line 2
    .line 3
    check-cast p2, Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᲈᲇᛶᲈ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxhss/ᲈᲇᛶᲈ;

    .line 10
    .line 11
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᲈᲇᛶᲈ;->ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᲈᲇᛶᲈ;->ᛷᛴᛷᛱ:Ljava/io/InputStream;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 10
    .line 11
    return-object p0
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
    .locals 0

    .line 1
    new-instance p1, Lxhss/ᲈᲇᛶᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲈᲇᛶᲈ;->ᛷᛴᛷᛱ:Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Lxhss/ᲈᲇᛶᲈ;-><init>(Ljava/io/InputStream;Lxhss/ᛱᛴᛶᛴ;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
