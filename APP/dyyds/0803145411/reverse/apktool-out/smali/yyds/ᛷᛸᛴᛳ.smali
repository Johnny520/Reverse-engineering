.class public final Lyyds/ᛷᛸᛴᛳ;
.super Lyyds/ᛶᛴᲀᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᲈᛱᲁᛱ;

.field public synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛱᲁᛱ;Lyyds/ᛶᛴᲀᛲ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛷᛸᛴᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛱᲁᛱ;

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
    iput-object p1, p0, Lyyds/ᛷᛸᛴᛳ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛷᛸᛴᛳ;->ᛱᲈᲁ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᛷᛸᛴᛳ;->ᛱᲈᲁ:I

    .line 9
    .line 10
    iget-object p1, p0, Lyyds/ᛷᛸᛴᛳ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛱᲁᛱ;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lyyds/ᲈᛱᲁᛱ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
