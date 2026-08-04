.class public final Lyyds/ᲀᛷᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᛴᛷ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᲈᲀᲀᛶ;

.field public final synthetic ᲇᲈᛵᛷ:Landroidx/activity/ᛲᲈᲁ;


# direct methods
.method public constructor <init>(Landroidx/activity/ᛲᲈᲁ;Lyyds/ᲈᲀᲀᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛷᛵᲁ;->ᲇᲈᛵᛷ:Landroidx/activity/ᛲᲈᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᛷᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᲀᛶ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛷᛵᲁ;->ᲇᲈᛵᛷ:Landroidx/activity/ᛲᲈᲁ;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲁᛳᛵ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᲀᛷᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᲀᛶ;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lyyds/ᛱᲁᛳᛵ;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, v2, Lyyds/ᛷᛴᛶᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x21

    .line 18
    .line 19
    if-lt p0, v1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    iput-object p0, v2, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/activity/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
