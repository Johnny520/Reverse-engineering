.class public LYue/ۥۢۢ۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۢ۟ۡ;
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

.method public static ۥ(Ljava/lang/String;I)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1}, Landroid/os/Trace;->beginAsyncSection(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟(Ljava/lang/String;I)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1}, Landroid/os/Trace;->endAsyncSection(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟۟()Z
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;J)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1, p2}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    return-void
.end method
