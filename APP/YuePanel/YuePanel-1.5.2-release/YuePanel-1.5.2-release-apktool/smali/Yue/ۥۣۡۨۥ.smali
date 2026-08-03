.class public final LYue/ۥۣۡۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۨۥ$ۥ۟۟;,
        LYue/ۥۣۡۨۥ$ۥ۟;,
        LYue/ۥۣۡۨۥ$ۥ;,
        LYue/ۥۣۡۨۥ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x1

.field public static final ۥ۟:I = 0x1

.field public static final ۥ۟۟:I = 0x2

.field public static final ۥ۟۟۟:I = 0xff

.field public static final ۥ۟۟۟۟:I = 0x40000fff


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Service;ILandroid/app/Notification;I)V
    .locals 2
    .param p0    # Landroid/app/Service;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۡۨۥ$ۥ۟۟;->ۥ(Landroid/app/Service;ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۡۨۥ$ۥ۟;->ۥ(Landroid/app/Service;ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟(Landroid/app/Service;I)V
    .locals 0
    .param p0    # Landroid/app/Service;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۣۡۨۥ$ۥ;->ۥ(Landroid/app/Service;I)V

    return-void
.end method
