.class public final LYue/ۥ۠ۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧۧ$ۥ۟۟;,
        LYue/ۥ۠ۧۧ$ۥ۟;,
        LYue/ۥ۠ۧۧ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/Context;)LYue/ۥ۠ۧۦۥ;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟۠ۧۦ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۧ;->ۥ۟۟(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۧ$ۥ۟۟;->ۥ(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۠(Landroid/os/LocaleList;)LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۡ()LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, LYue/ۥ۟ۡۥۥ;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/content/res/Configuration;)LYue/ۥ۠ۧۦۥ;
    .locals 0
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۧۧ$ۥ۟;->ۥ(Landroid/content/res/Configuration;)LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x21
    .end annotation

    const-string v0, "locale"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;)LYue/ۥ۠ۧۦۥ;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟۠ۧۦ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۟ۡ()LYue/ۥ۠ۧۦۥ;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۧۧ;->ۥ۟۟(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LYue/ۥ۠ۧۧ$ۥ۟۟;->ۥ۟(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۠(Landroid/os/LocaleList;)LYue/ۥ۠ۧۦۥ;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۧ;->ۥ۟(Landroid/content/res/Configuration;)LYue/ۥ۠ۧۦۥ;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method
