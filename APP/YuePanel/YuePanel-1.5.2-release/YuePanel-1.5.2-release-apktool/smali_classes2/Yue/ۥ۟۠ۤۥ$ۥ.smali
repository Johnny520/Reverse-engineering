.class public final LYue/ۥ۟۠ۤۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢ۠ۥۦ;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۤۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟۠ۤۥ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۢ۟ۢۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟۠ۤۥ$ۥ;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥ۟۠ۤۥ;

    invoke-direct {v0}, LYue/ۥ۟۠ۤۥ;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟()Z
    .locals 2

    sget-object v0, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
