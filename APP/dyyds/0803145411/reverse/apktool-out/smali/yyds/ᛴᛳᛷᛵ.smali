.class public final Lyyds/ᛴᛳᛷᛵ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛴᲈᲁᛴ;

.field public synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyyds/ᛴᲈᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛴᛳᛷᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲈᲁᛴ;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lyyds/ᛴᛳᛷᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛴᛳᛷᛵ;->ᛱᲈᲁ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᛴᛳᛷᛵ;->ᛱᲈᲁ:I

    .line 9
    .line 10
    iget-object p1, p0, Lyyds/ᛴᛳᛷᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲈᲁᛴ;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lyyds/ᛴᲈᲁᛴ;->ᛲᲈᲁ(Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
