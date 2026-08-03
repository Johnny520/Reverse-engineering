.class public LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "androidx.core.app.NotificationCompat$BigPictureStyle"


# instance fields
.field public ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

.field public ۥۣ۟۟۟:Z


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

.method public static ۥ۟۟ۡ۟(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1
    .param p0    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    if-eqz p0, :cond_1

    instance-of v0, p0, Landroid/graphics/drawable/Icon;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۧ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟۟ۡۤ(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1
    .param p0    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "android.picture"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟ۡ۟(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "android.pictureIcon"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟ۡ۟(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 5
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object v0

    new-instance v1, Landroid/app/Notification$BigPictureStyle;

    invoke-direct {v1, v0}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    const/16 v2, 0x1f

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_1

    instance-of v1, p1, LYue/ۥۡۢۦ۠;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, LYue/ۥۡۢۦ۠;

    invoke-virtual {v1}, LYue/ۥۡۢۦ۠;->ۥ۟۟۟۠()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iget-object v4, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v4, v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ۟;->ۥ(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۠ۦ()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_2

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۠ۢ()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v0

    :cond_2
    :goto_1
    iget-boolean v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۡ:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v1, :cond_3

    invoke-virtual {v0, v3}, Landroid/app/Notification$BigPictureStyle;->bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    goto :goto_2

    :cond_3
    instance-of v1, p1, LYue/ۥۡۢۦ۠;

    if-eqz v1, :cond_4

    check-cast p1, LYue/ۥۡۢۦ۠;

    invoke-virtual {p1}, LYue/ۥۡۢۦ۠;->ۥ۟۟۟۠()Landroid/content/Context;

    move-result-object v3

    :cond_4
    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1, v3}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ;->ۥ(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    :cond_5
    :goto_2
    iget-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/app/Notification$BigPictureStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v2, :cond_7

    iget-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥۣ۟۟۟:Z

    invoke-static {v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ۟;->ۥ۟۟(Landroid/app/Notification$BigPictureStyle;Z)V

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ۟;->ۥ۟(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_7
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

    const-string v0, "android.largeIcon.big"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.picture"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.pictureIcon"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.showBigPictureWhenCollapsed"

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

    const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"

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

    const-string v0, "android.largeIcon.big"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟ۡ۟(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۡ:Z

    :cond_0
    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟ۡۤ(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    const-string v0, "android.showBigPictureWhenCollapsed"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥۣ۟۟۟:Z

    return-void
.end method

.method public ۥ۟۟ۡ۠(Landroid/graphics/Bitmap;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۧ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۡ:Z

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(Landroid/graphics/drawable/Icon;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Icon;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۠:Landroidx/core/graphics/drawable/IconCompat;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۡ:Z

    return-object p0
.end method

.method public ۥ۟۟ۡۢ(Landroid/graphics/Bitmap;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۧ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥۣ۟۟ۡ(Landroid/graphics/drawable/Icon;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Icon;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1f
    .end annotation

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥ۟۟ۡۥ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
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

.method public ۥ۟۟ۡۦ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1f
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۡۧ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
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

.method public ۥ۟۟ۡۨ(Z)LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1f
    .end annotation

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۥ;->ۥۣ۟۟۟:Z

    return-object p0
.end method
