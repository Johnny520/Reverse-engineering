.class public LYue/ۥۡۢۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۥۦ$ۥ;,
        LYue/ۥۡۢۥۦ$ۥ۟۟;,
        LYue/ۥۡۢۥۦ$ۥ۟;,
        LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۢ:Ljava/lang/String; = "miscellaneous"

.field public static final ۥۣ۟۟۠:Z = true

.field public static final ۥ۟۟۠ۤ:I


# instance fields
.field public final ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/CharSequence;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:Ljava/lang/String;

.field public ۥ۟۟۟۟:Ljava/lang/String;

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Landroid/net/Uri;

.field public ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:Z

.field public ۥ۟۟۟ۦ:[J

.field public ۥ۟۟۟ۧ:Ljava/lang/String;

.field public ۥ۟۟۟ۨ:Ljava/lang/String;

.field public ۥ۟۟۠:Z

.field public ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:Z

.field public ۥ۟۟۠ۡ:Z


# direct methods
.method public constructor <init>(Landroid/app/NotificationChannel;)V
    .locals 3
    .param p1    # Landroid/app/NotificationChannel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .line 8
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥۣ۟۟۟(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۤ(Landroid/app/NotificationChannel;)I

    move-result v1

    invoke-direct {p0, v0, v1}, LYue/ۥۡۢۥۦ;-><init>(Ljava/lang/String;I)V

    .line 9
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۧ(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟:Ljava/lang/CharSequence;

    .line 10
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟:Ljava/lang/String;

    .line 11
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۢ(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    .line 12
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    .line 13
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۨ(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    .line 14
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟۠(Landroid/app/NotificationChannel;)Landroid/media/AudioAttributes;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    .line 15
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠ۥ(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥۣ۟۟۟:Z

    .line 16
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۥ(Landroid/app/NotificationChannel;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    .line 17
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠ۦ(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    .line 18
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠(Landroid/app/NotificationChannel;)[J

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۦ:[J

    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 20
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ۟۟;->ۥ۟(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    .line 21
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ۟۟;->ۥ(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۨ:Ljava/lang/String;

    .line 22
    :cond_0
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ(Landroid/app/NotificationChannel;)Z

    move-result v2

    iput-boolean v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠:Z

    .line 23
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟ۦ(Landroid/app/NotificationChannel;)I

    move-result v2

    iput v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠۟:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    .line 24
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ۟;->ۥ(Landroid/app/NotificationChannel;)Z

    move-result v2

    iput-boolean v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠۠:Z

    :cond_1
    if-lt v0, v1, :cond_2

    .line 25
    invoke-static {p1}, LYue/ۥۡۢۥۦ$ۥ۟۟;->ۥ۟۟(Landroid/app/NotificationChannel;)Z

    move-result p1

    iput-boolean p1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠ۡ:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    .line 3
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    iput-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    .line 5
    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LYue/ۥۡۢۥۦ;->ۥ:Ljava/lang/String;

    .line 6
    iput p2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟:I

    .line 7
    sget-object p1, Landroid/app/Notification;->AUDIO_ATTRIBUTES_DEFAULT:Landroid/media/AudioAttributes;

    iput-object p1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠۠:Z

    return v0
.end method

.method public ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠:Z

    return v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public ۥ۟۟۟()Landroid/media/AudioAttributes;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    return v0
.end method

.method public ۥ۟۟۟ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠۟:I

    return v0
.end method

.method public ۥ۟۟۟ۦ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Landroid/app/NotificationChannel;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟:Ljava/lang/CharSequence;

    iget v3, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟:I

    invoke-static {v1, v2, v3}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠۟(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠۠(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-boolean v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠ۢ(Landroid/app/NotificationChannel;Z)V

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    iget-object v3, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    invoke-static {v1, v2, v3}, LYue/ۥۡۢۥۦ$ۥ;->ۥۣ۟۟۠(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    iget-boolean v2, p0, LYue/ۥۡۢۥۦ;->ۥۣ۟۟۟:Z

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟(Landroid/app/NotificationChannel;Z)V

    iget v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠ۡ(Landroid/app/NotificationChannel;I)V

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۦ:[J

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۠ۤ(Landroid/app/NotificationChannel;[J)V

    iget-boolean v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    invoke-static {v1, v2}, LYue/ۥۡۢۥۦ$ۥ;->ۥ۟۟۟۟(Landroid/app/NotificationChannel;Z)V

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۨ:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v1, v0, v2}, LYue/ۥۡۢۥۦ$ۥ۟۟;->ۥ۟۟۟(Landroid/app/NotificationChannel;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v1
.end method

.method public ۥ۟۟۟ۨ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۠()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟۟۠۟()[J
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۦ:[J

    return-object v0
.end method

.method public ۥ۟۟۠۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۠ۡ:Z

    return v0
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥۣ۟۟۟:Z

    return v0
.end method

.method public ۥ۟۟۠ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    return v0
.end method

.method public ۥۣ۟۟۠()LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ:Ljava/lang/String;

    iget v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟:I

    invoke-direct {v0, v1, v2}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;-><init>(Ljava/lang/String;I)V

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟ۢ(Ljava/lang/CharSequence;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-boolean v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥۣ۟۟۟(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟ۤ(Landroid/net/Uri;Landroid/media/AudioAttributes;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-boolean v1, p0, LYue/ۥۡۢۥۦ;->ۥۣ۟۟۟:Z

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟ۡ(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟۠(I)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-boolean v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟ۥ(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۦ:[J

    invoke-virtual {v0, v1}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟۟۟ۦ([J)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۨ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;

    move-result-object v0

    return-object v0
.end method
