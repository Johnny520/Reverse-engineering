.class public final Lyyds/ᲇᛸᛱᲁ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/String;

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:Ljava/lang/String;

.field public ᛶᛷᛲᲁ:Ljava/lang/String;

.field public synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲁᛱ;

.field public ᛷᲈᲈᲁ:J

.field public ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛱᲁᛱ;Lyyds/ᛶᛴᲀᛲ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛸᛱᲁ;->ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲁᛱ;

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
    .locals 8

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛸᛱᲁ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᲇᛸᛱᲁ;->ᛲᛲᲈᲈ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᲇᛸᛱᲁ;->ᛲᛲᲈᲈ:I

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, p0, Lyyds/ᲇᛸᛱᲁ;->ᛷᛵᲇᲀ:Lyyds/ᲈᛱᲁᛱ;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, Lyyds/ᲈᛱᲁᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
