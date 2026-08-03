.class public LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Notification$BubbleMetadata;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
    .locals 3
    .param p0    # Landroid/app/Notification$BubbleMetadata;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getShortcutId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getShortcutId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getIntent()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;-><init>(Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;)V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getAutoExpandBubble()Z

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟(Z)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDeleteIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v2}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->isNotificationSuppressed()Z

    move-result v2

    invoke-virtual {v1, v2}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥۣ۟۟۟(Z)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeight()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeight()I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟(I)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    :cond_2
    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeightResId()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/app/Notification$BubbleMetadata;->getDesiredHeightResId()I

    move-result p0

    invoke-virtual {v0, p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟(I)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    :cond_3
    invoke-virtual {v0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ()LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;)Landroid/app/Notification$BubbleMetadata;
    .locals 3
    .param p0    # LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder;

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder;

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۤ()Landroid/graphics/drawable/Icon;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;)V

    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setAutoExpandBubble(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥۣ۟۟۟()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setSuppressNotification(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeight(I)Landroid/app/Notification$BubbleMetadata$Builder;

    :cond_2
    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeightResId(I)Landroid/app/Notification$BubbleMetadata$Builder;

    :cond_3
    invoke-virtual {v0}, Landroid/app/Notification$BubbleMetadata$Builder;->build()Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0
.end method
