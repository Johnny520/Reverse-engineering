.class public LYue/ۥۡۢۥۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->canBypassDnd()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->canShowBadge()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, p0, p1, p2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v0
.end method

.method public static ۥ۟۟۟(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->enableLights(Z)V

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/app/NotificationChannel;)Landroid/media/AudioAttributes;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getAudioAttributes()Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getDescription()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getGroup()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getImportance()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getLightColor()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getLockscreenVisibility()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getName()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/app/NotificationChannel;)Landroid/net/Uri;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getSound()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠(Landroid/app/NotificationChannel;)[J
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getVibrationPattern()[J

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۟(Landroid/app/NotificationChannel;Ljava/lang/String;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/app/NotificationChannel;Ljava/lang/String;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۠ۡ(Landroid/app/NotificationChannel;I)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setLightColor(I)V

    return-void
.end method

.method public static ۥ۟۟۠ۢ(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    return-void
.end method

.method public static ۥۣ۟۟۠(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    return-void
.end method

.method public static ۥ۟۟۠ۤ(Landroid/app/NotificationChannel;[J)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    return-void
.end method

.method public static ۥ۟۟۠ۥ(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->shouldShowLights()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۦ(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->shouldVibrate()Z

    move-result p0

    return p0
.end method
