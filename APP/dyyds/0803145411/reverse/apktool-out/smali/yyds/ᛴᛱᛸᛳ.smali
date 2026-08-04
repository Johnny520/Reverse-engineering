.class public final Lyyds/ᛴᛱᛸᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Z

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛳᲈᛸᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᲈᛸᛸ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲈᛸᛸ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛴᛱᛸᛳ;->ᲀᛲᛳᲀ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    invoke-static {}, Lyyds/ᛱᛷᲈᛲ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛴᛱᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲈᛸᛸ;

    .line 5
    .line 6
    iget-object v0, v0, Lyyds/ᛳᲈᛸᛸ;->ᛲᲈᲁ:Lyyds/ᲀᲇᛶᲇ;

    .line 7
    .line 8
    iget-boolean v1, v0, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 9
    .line 10
    iget-boolean p0, p0, Lyyds/ᛴᛱᛸᛳ;->ᲀᛲᛳᲀ:Z

    .line 11
    .line 12
    iput-boolean p0, v0, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 13
    .line 14
    if-eq v1, p0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lyyds/ᲇᛷᲀᲀ;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lyyds/ᲇᛷᲀᲀ;->ᛲᲈᲁ(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
