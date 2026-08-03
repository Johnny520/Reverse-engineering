.class public LYue/ۥۡۢۦ$ۥ۟۟۠۠;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0\u06e0"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۠۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"

.field public static final ۥ۟۟۟۠:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    return-void
.end method

.method public static ۥ۟۟ۡۡ(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df;",
            ">;)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۦ$ۥ۟;

    invoke-virtual {v1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۦ()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {}, LYue/ۥۡۢۦ$ۥ۟۟۠۠$ۥ;->ۥ()Landroid/app/Notification$Style;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    return-void
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 v0, 0x1

    return v0
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

    const-string v0, "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"

    return-object v0
.end method

.method public ۥ۟۟۠ۥ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥۡۢۥۥ;)Landroid/widget/RemoteViews;
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟ۡ۟(Landroid/widget/RemoteViews;Z)Landroid/widget/RemoteViews;
    .locals 6

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟(ZIZ)Landroid/widget/RemoteViews;

    move-result-object v0

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۢ۟:I

    invoke-virtual {v0, v1}, Landroid/widget/RemoteViews;->removeAllViews(I)V

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/ArrayList;

    invoke-static {v1}, LYue/ۥۡۢۦ$ۥ۟۟۠۠;->ۥ۟۟ۡۡ(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz p2, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p2

    const/4 v3, 0x3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-lez p2, :cond_0

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥۡۢۦ$ۥ۟;

    invoke-virtual {p0, v4}, LYue/ۥۡۢۦ$ۥ۟۟۠۠;->ۥ۟۟ۡ۠(LYue/ۥۡۢۦ$ۥ۟;)Landroid/widget/RemoteViews;

    move-result-object v4

    sget v5, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۢ۟:I

    invoke-virtual {v0, v5, v4}, Landroid/widget/RemoteViews;->addView(ILandroid/widget/RemoteViews;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :cond_1
    sget p2, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۢ۟:I

    invoke-virtual {v0, p2, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    sget p2, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۡۧ:I

    invoke-virtual {v0, p2, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟۟(Landroid/widget/RemoteViews;Landroid/widget/RemoteViews;)V

    return-object v0
.end method

.method public final ۥ۟۟ۡ۠(LYue/ۥۡۢۦ$ۥ۟;)Landroid/widget/RemoteViews;
    .locals 5

    iget-object v0, p1, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۥ:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Landroid/widget/RemoteViews;

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v2, v2, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_1

    sget v3, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:I

    goto :goto_1

    :cond_1
    sget v3, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۡ;->ۥ۟۟۟:I

    :goto_1
    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟۠()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-eqz v2, :cond_2

    sget v3, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۡۨ:I

    sget v4, LYue/ۥۡۥۨۡ$ۥ۟;->ۥ۟۟۟۟:I

    invoke-virtual {p0, v2, v4}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠(Landroidx/core/graphics/drawable/IconCompat;I)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    :cond_2
    sget v2, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۢ:I

    iget-object v3, p1, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    if-nez v0, :cond_3

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۡۦ:I

    iget-object v2, p1, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۥ:Landroid/app/PendingIntent;

    invoke-virtual {v1, v0, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    :cond_3
    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟۟;->ۥ۟۟ۡۦ:I

    iget-object p1, p1, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0, p1}, Landroid/widget/RemoteViews;->setContentDescription(ILjava/lang/CharSequence;)V

    return-object v1
.end method
