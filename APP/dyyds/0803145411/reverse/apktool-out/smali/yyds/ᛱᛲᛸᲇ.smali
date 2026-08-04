.class public final Lyyds/ᛱᛲᛸᲇ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

.field public synthetic ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public ᛶᛷᛲᲁ:Lyyds/ᲁᛶᲁᲀ;

.field public ᛷᛲᲈᛱ:I

.field public final synthetic ᛷᲈᲈᲁ:Lyyds/ᛴᲈᲁᛴ;

.field public ᲇᲇᲇᛱ:J


# direct methods
.method public constructor <init>(Lyyds/ᛴᲈᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛲᛸᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛴᲈᲁᛴ;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyyds/ᛶᛴᲀᛲ;-><init>(Lyyds/ᛲᛱᛶᛸ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛲᛸᲇ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛱᛲᛸᲇ;->ᛷᛲᲈᛱ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᛱᛲᛸᲇ;->ᛷᛲᲈᛱ:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lyyds/ᛱᛲᛸᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛴᲈᲁᛴ;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Lyyds/ᛴᲈᲁᛴ;->ᛵᛸᛸᛷ(JLyyds/ᛸᛲᛴᲇ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
