.class public final LYue/ۥۢۤۤۦ$ۥ۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۤۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e0"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/View;)[Ljava/lang/String;
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getReceiveContentMimeTypes()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/view/View;LYue/ۥۣ۟ۧۡ;)LYue/ۥۣ۟ۧۡ;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۧۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۦ()Landroid/view/ContentInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->performReceiveContent(Landroid/view/ContentInfo;)Landroid/view/ContentInfo;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object p1

    :cond_1
    invoke-static {p0}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۧ(Landroid/view/ContentInfo;)LYue/ۥۣ۟ۧۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/view/View;[Ljava/lang/String;LYue/ۥۣۡۢۢ;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۢۢ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setOnReceiveContentListener([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۤۤۦ$ۥۣ۟۟۠;

    invoke-direct {v0, p2}, LYue/ۥۢۤۤۦ$ۥۣ۟۟۠;-><init>(LYue/ۥۣۡۢۢ;)V

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setOnReceiveContentListener([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    :goto_0
    return-void
.end method
