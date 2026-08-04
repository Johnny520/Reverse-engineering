.class public final Lyyds/ᛷᲁᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public final ᛲᛴᛳᛲ:I

.field public ᛲᲈᲁ:Lyyds/ᛷᲁᛷᲇ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

.field public ᛶᛷᛲᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public ᛷᲈᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

.field public final ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᲇᲇᛶᛶ;

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛶᲇᛸᛱ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lyyds/ᛷᲁᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛷᲁᛷᲇ;

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛷᲁᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iput p2, p0, Lyyds/ᛷᲁᛷᲇ;->ᲀᛲᛳᲀ:I

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput p2, p0, Lyyds/ᛷᲁᛷᲇ;->ᲇᲈᛵᛷ:I

    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p4}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lyyds/ᛷᲁᛷᲇ;->ᛲᛴᛳᛲ:I

    .line 28
    .line 29
    :cond_0
    return-void
.end method
