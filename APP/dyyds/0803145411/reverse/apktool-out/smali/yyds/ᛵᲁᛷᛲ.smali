.class public final Lyyds/ᛵᲁᛷᛲ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:[Ljava/lang/String;

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:I

.field public ᛶᛷᛲᲁ:Ljava/lang/String;

.field public synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᲇᲀ:Lyyds/ᛳᲀᛸᛸ;

.field public ᛷᲈᲈᲁ:I

.field public ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛸᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛶᛴᲀᛲ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛵᲁᛷᛲ;->ᛷᛵᲇᲀ:Lyyds/ᛳᲀᛸᛸ;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lyyds/ᛵᲁᛷᛲ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᛵᲁᛷᛲ;->ᛲᛲᲈᲈ:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lyyds/ᛵᲁᛷᛲ;->ᛷᛵᲇᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lyyds/ᛳᲀᛸᛸ;->ᛲᛴᛳᛲ(Lyyds/ᲈᛶᛷᲀ;ILyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
