.class public LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "androidx.core.app.NotificationCompat$BigTextStyle"


# instance fields
.field public ۥ۟۟۟۟:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V
    .locals 0
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟ۡ(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ(Landroid/os/Bundle;)V

    return-void
.end method

.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    new-instance v0, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v0, p1}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    :cond_0
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

    const-string v0, "android.bigText"

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

    const-string v0, "androidx.core.app.NotificationCompat$BigTextStyle"

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Landroid/os/Bundle;)V
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

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۨ(Landroid/os/Bundle;)V

    const-string v0, "android.bigText"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:Ljava/lang/CharSequence;

    return-void
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۡ۠(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;
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

.method public ۥ۟۟ۡۡ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۦ;
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
