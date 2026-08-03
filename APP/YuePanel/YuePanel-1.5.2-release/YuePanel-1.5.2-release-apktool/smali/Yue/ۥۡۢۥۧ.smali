.class public LYue/ۥۡۢۥۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۥۧ$ۥ;,
        LYue/ۥۡۢۥۧ$ۥ۟;,
        LYue/ۥۡۢۥۧ$ۥ۟۟;
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/CharSequence;

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/NotificationChannelGroup;)V
    .locals 1
    .param p1    # Landroid/app/NotificationChannelGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYue/ۥۡۢۥۧ;-><init>(Landroid/app/NotificationChannelGroup;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/NotificationChannelGroup;Ljava/util/List;)V
    .locals 3
    .param p1    # Landroid/app/NotificationChannelGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/NotificationChannelGroup;",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-static {p1}, LYue/ۥۡۢۥۧ$ۥ;->ۥ۟۟۟(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, LYue/ۥۡۢۥۧ;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-static {p1}, LYue/ۥۡۢۥۧ$ۥ;->ۥ۟۟۟۟(Landroid/app/NotificationChannelGroup;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟:Ljava/lang/CharSequence;

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 8
    invoke-static {p1}, LYue/ۥۡۢۥۧ$ۥ۟;->ۥ(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟:Ljava/lang/String;

    :cond_0
    if-lt v0, v1, :cond_1

    .line 9
    invoke-static {p1}, LYue/ۥۡۢۥۧ$ۥ۟;->ۥ۟(Landroid/app/NotificationChannelGroup;)Z

    move-result p2

    iput-boolean p2, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟:Z

    .line 10
    invoke-static {p1}, LYue/ۥۡۢۥۧ$ۥ;->ۥ۟(Landroid/app/NotificationChannelGroup;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۢۥۧ;->ۥ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۟:Ljava/util/List;

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0, p2}, LYue/ۥۡۢۥۧ;->ۥ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۟:Ljava/util/List;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۟:Ljava/util/List;

    .line 3
    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LYue/ۥۡۢۥۧ;->ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e5\u06e6;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, LYue/ۥۡۢۥۧ;->ۥ:Ljava/lang/String;

    invoke-static {v1}, LYue/ۥۡۢۥۧ$ۥ;->ۥ۟۟(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, LYue/ۥۡۢۥۦ;

    invoke-direct {v2, v1}, LYue/ۥۡۢۥۦ;-><init>(Landroid/app/NotificationChannel;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Landroid/app/NotificationChannelGroup;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, p0, LYue/ۥۡۢۥۧ;->ۥ:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۡۢۥۧ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-static {v1, v2}, LYue/ۥۡۢۥۧ$ۥ;->ۥ(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/app/NotificationChannelGroup;

    move-result-object v1

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟:Ljava/lang/String;

    invoke-static {v1, v0}, LYue/ۥۡۢۥۧ$ۥ۟;->ۥ۟۟(Landroid/app/NotificationChannelGroup;Ljava/lang/String;)V

    :cond_0
    return-object v1
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥۡۢۥۧ$ۥ۟۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۢۥۧ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۡۢۥۧ;->ۥ:Ljava/lang/String;

    invoke-direct {v0, v1}, LYue/ۥۡۢۥۧ$ۥ۟۟;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥۡۢۥۧ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ۟۟(Ljava/lang/CharSequence;)LYue/ۥۡۢۥۧ$ۥ۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۧ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۧ$ۥ۟۟;->ۥ۟(Ljava/lang/String;)LYue/ۥۡۢۥۧ$ۥ۟۟;

    move-result-object v0

    return-object v0
.end method
