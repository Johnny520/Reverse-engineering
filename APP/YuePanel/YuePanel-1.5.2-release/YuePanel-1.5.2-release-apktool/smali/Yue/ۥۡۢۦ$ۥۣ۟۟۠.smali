.class public LYue/ۥۡۢۦ$ۥۣ۟۟۠;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0\u06e3"
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "androidx.core.app.NotificationCompat$InboxStyle"


# instance fields
.field public ۥ۟۟۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V
    .locals 1
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟ۡ(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 2
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    new-instance v0, Landroid/app/Notification$InboxStyle;

    invoke-direct {v0, p1}, Landroid/app/Notification$InboxStyle;-><init>(Landroid/app/Notification$Builder;)V

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    move-result-object p1

    iget-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/app/Notification$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p1, v1}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟ۡ(Landroid/os/Bundle;)V

    const-string v0, "android.textLines"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-void
.end method

.method public ۥۣ۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "androidx.core.app.NotificationCompat$InboxStyle"

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۨ(Landroid/os/Bundle;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-string v0, "android.textLines"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥۣ۟۟۠;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥۣ۟۟۠;->ۥ۟۟۟۟:Ljava/util/ArrayList;

    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟ۡ۠(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥۣ۟۟۠;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥۣ۟۟۠;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟:Z

    return-object p0
.end method
