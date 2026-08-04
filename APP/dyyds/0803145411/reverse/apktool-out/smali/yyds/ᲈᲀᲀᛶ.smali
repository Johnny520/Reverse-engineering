.class public final Lyyds/ᲈᲀᲀᛶ;
.super Lyyds/ᛷᛴᛶᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲈᛵᲇᛴ;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;Lyyds/ᲈᛵᲇᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲈᲀᲀᛶ;->ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲈᲀᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛵᲇᛴ;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lyyds/ᛷᛴᛶᲀ;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲀᲀᛶ;->ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᲈᲁ()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲈᲈᲁ:Lyyds/ᲈᛲᛵ;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Lyyds/ᲈᛲᛵ;->ᛱᛳᲇ()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ:Z

    .line 26
    .line 27
    iget-object v0, p0, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lyyds/ᲁᛵᲀᛵ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_2
    const/4 v0, 0x1

    .line 35
    :try_start_0
    iget-object v1, p0, Lyyds/ᲈᲀᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛵᲇᛴ;

    .line 36
    .line 37
    invoke-interface {v1}, Lyyds/ᲈᛵᲇᛴ;->ᛲᲈᲁ()Landroidx/activity/ᛲᲈᲁ;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroidx/activity/ᛲᲈᲁ;->ᛵᛸᛸᛷ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    iput-boolean v0, p0, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ:Z

    .line 45
    .line 46
    iget-object p0, p0, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lyyds/ᲁᛵᲀᛵ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_0
    return-void

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    iput-boolean v0, p0, Lyyds/ᛷᛴᛶᲀ;->ᛲᲈᲁ:Z

    .line 56
    .line 57
    iget-object p0, p0, Lyyds/ᛷᛴᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛵᲀᛵ;

    .line 58
    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Lyyds/ᲁᛵᲀᛵ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_4
    throw v1
.end method
