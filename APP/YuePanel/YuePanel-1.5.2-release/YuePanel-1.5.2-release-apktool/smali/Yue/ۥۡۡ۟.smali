.class public final LYue/ۥۡۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡ۟$ۥ;
    }
.end annotation


# static fields
.field public static ۥ:Z = true

.field public static ۥ۟:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/os/Message;)Z
    .locals 0
    .param p0    # Landroid/os/Message;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۡ۟$ۥ;->ۥ(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/os/Message;Z)V
    .locals 0
    .param p0    # Landroid/os/Message;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۡ۟$ۥ;->ۥ۟(Landroid/os/Message;Z)V

    return-void
.end method
