.class public final Lxhss/ᛷᛲᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲇᲈᛷ;

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:I

.field public ᛷᛵᛵᲈ:Lxhss/ᛷᛲᛴᛵ;

.field public ᛸᛲᲀᛵ:Lxhss/ᛱᲇᲈᛶ;

.field public ᛸᛴᛶᛳ:Lxhss/ᛱᲇᲈᛶ;

.field public ᛸᛷᲈᲈ:Lxhss/ᛷᛱᛳᲁ;

.field public ᲀᲇᛳᲁ:Lxhss/ᛱᲇᲈᛶ;

.field public final ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:Lxhss/ᛱᲇᲈᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lxhss/ᛷᛲᛴᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛲᛴᛵ;

    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛷᛲᛴᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲇᲈᛷ;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iput p2, p0, Lxhss/ᛷᛲᛴᛵ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput p2, p0, Lxhss/ᛷᛲᛴᛵ;->ᲇᛴᲇᛵ:I

    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p4}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lxhss/ᛷᛲᛴᛵ;->ᛷᛴᛷᛱ:I

    .line 28
    .line 29
    :cond_0
    return-void
.end method
