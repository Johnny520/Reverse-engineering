.class public abstract Lyyds/ᲁᲀᛶᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲁᛸᲀ;


# instance fields
.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lyyds/ᲁᛲᲀᛷ;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ᛱᲈᲁ()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lyyds/ᛵᛴᲈᛵ;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lyyds/ᛵᛴᲈᛵ;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v2, p0}, Lyyds/ᛵᛴᲈᛵ;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lyyds/ᲁᛲᲀᛷ;

    .line 32
    .line 33
    iget-object p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛲᛵᛷᛲ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    const-class v2, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p1, v2, p0}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p1, v3, p0}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, v1, v2, p1, p0}, Lyyds/ᛲᛵᛷᛲ;-><init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;Lyyds/ᛴᛷᛷ;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public abstract ᛲᛴᛳᛲ()I
.end method

.method public abstract ᛶᛷᛲᲁ()V
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛵᛴᲈᛵ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyyds/ᲁᛲᲀᛷ;

    .line 10
    .line 11
    iget-object v1, v1, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public ᲇᲇᲇᛱ(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᛲᛴᲁᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛲᛴᲁᛷ;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lyyds/ᛴᲈᛲᛷ;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛴᲈᛲᛷ;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Lyyds/ᛴᲈᛲᛷ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/MenuItem;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lyyds/ᛸᛶᲇᛳ;

    .line 30
    .line 31
    iget-object v1, p0, Lyyds/ᲁᲀᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroid/content/Context;

    .line 34
    .line 35
    invoke-direct {v0, v1, p1}, Lyyds/ᛸᛶᲇᛳ;-><init>(Landroid/content/Context;Lyyds/ᛲᛴᲁᛷ;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lyyds/ᲁᲀᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lyyds/ᛴᲈᛲᛷ;

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Lyyds/ᛴᲈᛲᛷ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    return-object v0

    .line 46
    :cond_2
    return-object p1
.end method

.method public abstract ᲇᲈᛵᛷ()Landroid/content/IntentFilter;
.end method
