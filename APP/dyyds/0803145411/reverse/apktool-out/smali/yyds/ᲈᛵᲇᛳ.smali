.class public final Lyyds/ᲈᛵᲇᛳ;
.super Lyyds/ᲁᲈᛳᛴ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛴᛲᛶᲈ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛲᛶᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛵᲇᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛲᛶᲈ;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lyyds/ᲈᛵᲇᛳ;->ᛲᲈᲁ:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-boolean p1, p0, Lyyds/ᲈᛵᲇᛳ;->ᛲᲈᲁ:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lyyds/ᲈᛵᲇᛳ;->ᛲᲈᲁ:Z

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᲈᛵᲇᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛲᛶᲈ;

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛴᛲᛶᲈ;->ᛶᛷᛲᲁ()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛵᲇᛲᛱ;II)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lyyds/ᲈᛵᲇᛳ;->ᛲᲈᲁ:Z

    .line 9
    .line 10
    return-void
.end method
