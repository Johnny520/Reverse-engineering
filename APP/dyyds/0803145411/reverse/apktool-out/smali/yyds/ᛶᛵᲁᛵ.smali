.class public final Lyyds/ᛶᛵᲁᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᲇᛴᲀ;


# instance fields
.field public final ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/ᛲᲈᲁ;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/lifecycle/ᛲᲈᲁ;-><init>(Lyyds/ᲁᲇᛴᲀ;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲈᛷᛸ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    :cond_0
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛶᲈᛷᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲈᛷᛸ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲈᛷᛸ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    :cond_0
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method
