.class public final Lyyds/ᛲᲈᲈ;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛶᲀᛶᲀ;

.field public final ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:Lyyds/ᲁᛱᛸᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᲀᲀᛱ;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, p3}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛲᲈᲈ;->ᛲᲈᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 10
    .line 11
    iget-boolean p1, p2, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Lyyds/ᛲᲈᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᛸᛵ;

    .line 15
    .line 16
    iput-boolean p1, p0, Lyyds/ᛲᲈᲈ;->ᛵᛸᛸᛷ:Z

    .line 17
    .line 18
    return-void
.end method
