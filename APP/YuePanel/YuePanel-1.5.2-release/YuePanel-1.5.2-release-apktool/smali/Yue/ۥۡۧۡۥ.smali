.class public final LYue/ۥۡۧۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۡۥ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/database/sqlite/SQLiteCursor;Z)V
    .locals 2
    .param p0    # Landroid/database/sqlite/SQLiteCursor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۡۧۡۥ$ۥ;->ۥ(Landroid/database/sqlite/SQLiteCursor;Z)V

    :cond_0
    return-void
.end method
