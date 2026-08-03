.class public final LYue/ۥ۟ۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۦۧ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/res/Configuration;)LYue/ۥ۠ۧۦۥ;
    .locals 0
    .param p0    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۦۧ$ۥ;->ۥ(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۧۦۥ;->ۥ۟۟۠(Landroid/os/LocaleList;)LYue/ۥ۠ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/content/res/Configuration;LYue/ۥ۠ۧۦۥ;)V
    .locals 0
    .param p0    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۧۦۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۟ۦۧ$ۥ;->ۥ۟(Landroid/content/res/Configuration;LYue/ۥ۠ۧۦۥ;)V

    return-void
.end method
