.class public abstract Lyyds/ᛲᛵᲀᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p2, p0, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ:I

    .line 20
    iput-object p1, p0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 21
    iput-object p3, p0, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛱᲇᛷᲈ;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ:I

    .line 24
    new-instance v0, Lyyds/ᲇᛳᛱᲀ;

    invoke-direct {v0}, Lyyds/ᲇᛳᛱᲀ;-><init>()V

    iput-object v0, p0, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲇᲇᛵᛲ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    iput v0, p0, Lyyds/ᛲᛵᲀᛳ;->ᛲᲈᲁ:I

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛲᛵᲀᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᲇᲇᛵᛲ;I)Lyyds/ᛲᛵᲀᛳ;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Lyyds/ᛲᛷᲇᛷ;

    .line 7
    .line 8
    invoke-direct {p1, p0, v0}, Lyyds/ᛲᛷᲇᛷ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const-string p0, "invalid orientation"

    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p1, Lyyds/ᛲᛷᲇᛷ;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, p0, v0}, Lyyds/ᛲᛷᲇᛷ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method


# virtual methods
.method public abstract ᛱᛳᲇ()I
.end method

.method public abstract ᛱᲈᲁ()I
.end method

.method public abstract ᛲᛲᲈᲈ()I
.end method

.method public abstract ᛲᛳᛶᲁ()I
.end method

.method public abstract ᛲᛴᛳᛲ(Landroid/view/View;)I
.end method

.method public abstract ᛲᲈᲁ(Lyyds/ᛱᛵᛷ;)V
.end method

.method public abstract ᛳᛸᛴᛶ()V
.end method

.method public abstract ᛳᲁᲁᲇ(Landroid/view/View;)I
.end method

.method public abstract ᛵᛶᛲᲀ()V
.end method

.method public abstract ᛶᛳᛶᛵ(I)V
.end method

.method public abstract ᛶᛷᛲᲁ(Landroid/view/View;)I
.end method

.method public abstract ᛶᛸᲀᲁ(Lyyds/ᛱᛵᛷ;)Lyyds/ᛷᛶᛳᛸ;
.end method

.method public abstract ᛶᲈᛴᲈ(Lyyds/ᛱᛵᛷ;)V
.end method

.method public abstract ᛷᛲᲈᛱ()I
.end method

.method public abstract ᛷᛵᲇᲀ()I
.end method

.method public abstract ᛷᲈᲈᲁ()I
.end method

.method public abstract ᲀᛲᛲᲇ(Lyyds/ᛱᛵᛷ;)V
.end method

.method public abstract ᲀᛲᛳᲀ(Lyyds/ᛱᛵᛷ;)V
.end method

.method public abstract ᲇᛱᛲ(Landroid/view/View;)I
.end method

.method public abstract ᲇᲇᲇᛱ(Landroid/view/View;)I
.end method

.method public abstract ᲇᲈᛵᛷ(Landroid/view/View;)I
.end method
