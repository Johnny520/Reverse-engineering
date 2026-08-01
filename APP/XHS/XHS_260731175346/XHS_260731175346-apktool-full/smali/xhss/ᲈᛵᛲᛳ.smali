.class public final Lxhss/ᲈᛵᛲᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲇᲈᛷ;

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:I

.field public ᛷᛵᛵᲈ:Lxhss/ᲈᛵᛲᛳ;

.field public ᛷᲁᲁ:Lxhss/ᛷᛱᛳᲁ;

.field public ᛸᛲᲀᛵ:Lxhss/ᛱᲇᲈᛶ;

.field public ᛸᛴᛶᛳ:Lxhss/ᛱᲇᲈᛶ;

.field public ᛸᛷᲈᲈ:Lxhss/ᛱᲇᲈᛶ;

.field public final ᲀᲇᛳᲁ:I

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:I

.field public ᲈᛳᲀ:Lxhss/ᛱᲇᲈᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᲇᲇᲈᛷ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lxhss/ᲈᛵᛲᛳ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛵᛲᛳ;

    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᲈᛵᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲇᲈᛷ;

    .line 8
    .line 9
    iput p2, p0, Lxhss/ᲈᛵᛲᛳ;->ᛳᲁᲇᛸ:I

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lxhss/ᲈᛵᛲᛳ;->ᲇᛴᲇᛵ:I

    .line 16
    .line 17
    invoke-virtual {p1, p4}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p0, Lxhss/ᲈᛵᛲᛳ;->ᛷᛴᛷᛱ:I

    .line 22
    .line 23
    if-eqz p5, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p5}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p0, Lxhss/ᲈᛵᛲᛳ;->ᲇᛶᛴᲀ:I

    .line 30
    .line 31
    :cond_0
    if-eqz p6, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, p6}, Lxhss/ᲇᲇᲈᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)Lxhss/ᛳᛴᛶᛷ;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget p1, p1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 38
    .line 39
    iput p1, p0, Lxhss/ᲈᛵᛲᛳ;->ᲀᲇᛳᲁ:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method
