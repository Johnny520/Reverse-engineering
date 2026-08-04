.class public final Lyyds/ᛷᲀᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public final ᛲᛴᛳᛲ:I

.field public ᛲᲈᲁ:Lyyds/ᛷᲀᲀᛲ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

.field public final ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:Lyyds/ᲇᲇᛶᛶ;

.field public ᛷᛵᲇᲀ:Lyyds/ᛳᛷᲀᛴ;

.field public ᛷᲈᲈᲁ:Lyyds/ᲇᲇᛶᛶ;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛶᲇᛸᛱ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lyyds/ᛷᲀᲀᛲ;->ᛲᲈᲁ:Lyyds/ᛷᲀᲀᛲ;

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛷᲀᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛸᛱ;

    .line 8
    .line 9
    iput p2, p0, Lyyds/ᛷᲀᲀᛲ;->ᲀᛲᛳᲀ:I

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lyyds/ᛷᲀᲀᛲ;->ᲇᲈᛵᛷ:I

    .line 16
    .line 17
    invoke-virtual {p1, p4}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p0, Lyyds/ᛷᲀᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 22
    .line 23
    if-eqz p5, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p5}, Lyyds/ᛶᲇᛸᛱ;->ᛲᛳᛶᲁ(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p0, Lyyds/ᛷᲀᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 30
    .line 31
    :cond_0
    if-eqz p6, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, p6}, Lyyds/ᛶᲇᛸᛱ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Lyyds/ᲇᛱ;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget p1, p1, Lyyds/ᲇᛱ;->ᛲᲈᲁ:I

    .line 38
    .line 39
    iput p1, p0, Lyyds/ᛷᲀᲀᛲ;->ᛶᛷᛲᲁ:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method
