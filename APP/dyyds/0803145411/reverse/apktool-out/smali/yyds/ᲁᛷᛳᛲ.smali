.class public final Lyyds/ᲁᛷᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛷᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛷᛳᛲ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget-boolean v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛸᲀᲁ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛶᲈᛴᲈ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛲᲈᛲ;

    .line 12
    .line 13
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᛳᛶᛳ:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->requestLayout()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
