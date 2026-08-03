.class public final LYue/ۥۣ۠ۧۥ$ۥ;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۧۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣ۠ۧۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۧۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۠ۧۥ$ۥ;->ۥ:LYue/ۥۣ۠ۧۥ;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onChange(Z)V
    .locals 0

    iget-object p1, p0, LYue/ۥۣ۠ۧۥ$ۥ;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۠۟()V

    return-void
.end method
