.class public final Lyyds/ᛳᛲᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛷ;

.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛱᛱᛴ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛸᲈ;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛱᛴ;Lyyds/ᛳᛵᛸᛷ;Lyyds/ᛵᛷᛸᲈ;Lyyds/ᛴᛴᛵᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛱᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᛲᛱᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛷ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛳᛲᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛸᲈ;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛳᛲᛱᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛱᛴ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᲁᲈᲇᛴ;

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛳᛲᛱᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛷ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, v0, Lyyds/ᲁᲈᲇᛴ;->ᛷᛸᲇᛶ:Z

    .line 13
    .line 14
    iget-object v1, v1, Lyyds/ᛳᛵᛸᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛴᛵᛸ;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Lyyds/ᛴᛴᛵᛸ;->ᲀᛲᛳᲀ(Z)V

    .line 18
    .line 19
    .line 20
    iput-boolean v2, v0, Lyyds/ᲁᲈᲇᛴ;->ᛷᛸᲇᛶ:Z

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lyyds/ᛳᛲᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛸᲈ;

    .line 23
    .line 24
    invoke-virtual {v0}, Lyyds/ᛵᛷᛸᲈ;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lyyds/ᛵᛷᛸᲈ;->hasSubMenu()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    const/4 v2, 0x0

    .line 38
    iget-object p0, p0, Lyyds/ᛳᛲᛱᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 39
    .line 40
    invoke-virtual {p0, v0, v2, v1}, Lyyds/ᛴᛴᛵᛸ;->ᛶᛳᛶᛵ(Landroid/view/MenuItem;Lyyds/ᛳᛶᛵᲈ;I)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method
