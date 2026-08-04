.class public final Lyyds/ᲁᛶᲈᲇ;
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
    iput-object p1, p0, Lyyds/ᲁᛶᲈᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛱᲁᛱ;

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
    iput-object p1, p0, Lyyds/ᲁᛶᲈᲇ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᲁᛶᲈᲇ;->ᛱᲈᲁ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyyds/ᲁᛶᲈᲇ;->ᛱᲈᲁ:I

    .line 9
    .line 10
    iget-object p1, p0, Lyyds/ᲁᛶᲈᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛱᲁᛱ;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, Lyyds/ᲈᛱᲁᛱ;->ᛶᛷᛲᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, Lyyds/ᲁᛶᛱᛵ;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lyyds/ᲁᛶᛱᛵ;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
