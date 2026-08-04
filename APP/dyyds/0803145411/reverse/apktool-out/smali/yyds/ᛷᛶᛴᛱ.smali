.class public final Lyyds/ᛷᛶᛴᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public final synthetic ᛶᛷᛲᲁ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲇᲇᛱ:[I

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛶᛴᛱ;->ᛶᛷᛲᲁ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛷᛶᛴᛱ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lyyds/ᛷᛶᛴᛱ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    const/high16 v1, -0x80000000

    .line 5
    .line 6
    iput v1, p0, Lyyds/ᛷᛶᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, Lyyds/ᛷᛶᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Lyyds/ᛷᛶᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Lyyds/ᛷᛶᛴᛱ;->ᛲᛴᛳᛲ:Z

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛷᛶᛴᛱ;->ᲇᲇᲇᛱ:[I

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
