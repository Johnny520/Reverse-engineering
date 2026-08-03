.class public final LYue/ۥۡۢۦ$ۥ۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۦ$ۥ۟۟۠ۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "TvExtender"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "android.tv.EXTENSIONS"
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "flags"
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "content_intent"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "delete_intent"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "channel_id"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "suppressShowOverApps"

.field public static final ۥ۟۟۟ۧ:I = 0x1


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Landroid/app/PendingIntent;

.field public ۥ۟۟۟:Landroid/app/PendingIntent;

.field public ۥ۟۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Notification;)V
    .locals 1
    .param p1    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-object p1, p1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    const-string v0, "android.tv.EXTENSIONS"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 6
    const-string v0, "flags"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ:I

    .line 7
    const-string v0, "channel_id"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟:Ljava/lang/String;

    .line 8
    const-string v0, "suppressShowOverApps"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟۟:Z

    .line 9
    const-string v0, "content_intent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟:Landroid/app/PendingIntent;

    .line 10
    const-string v0, "delete_intent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/PendingIntent;

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    :cond_1
    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
    .locals 3
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "flags"

    iget v2, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "channel_id"

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "suppressShowOverApps"

    iget-boolean v2, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟۟:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟:Landroid/app/PendingIntent;

    if-eqz v1, :cond_0

    const-string v2, "content_intent"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    if-eqz v1, :cond_1

    const-string v2, "delete_intent"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "android.tv.EXTENSIONS"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟()Landroid/app/PendingIntent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public ۥ۟۟۟()Landroid/app/PendingIntent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۢۦ$ۥ۟۟ۡ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟ۡ;
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public ۥۣ۟۟۟(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟ۡ;
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Z)LYue/ۥۡۢۦ$ۥ۟۟ۡ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟ۡ;->ۥ۟۟۟۟:Z

    return-object p0
.end method
