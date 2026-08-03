.class public LYue/ۥۡۢۦ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Notification;)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getBadgeIconType()I

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/app/Notification;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/app/Notification;)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getGroupAlertBehavior()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/app/Notification;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getSettingsText()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/app/Notification;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getShortcutId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Landroid/app/Notification;)J
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Notification;->getTimeoutAfter()J

    move-result-wide v0

    return-wide v0
.end method
