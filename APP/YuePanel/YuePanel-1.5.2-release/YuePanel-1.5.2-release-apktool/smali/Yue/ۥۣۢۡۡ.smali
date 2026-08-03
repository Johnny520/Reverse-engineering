.class public abstract LYue/ۥۣۢۡۡ;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService"
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ActionValue"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥ۠ۥ۟ۨ$ۥ۟;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, LYue/ۥۣۢۡۡ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣۢۡۡ$ۥ;-><init>(LYue/ۥۣۢۡۡ;)V

    iput-object v0, p0, LYue/ۥۣۢۡۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۥ۟ۨ$ۥ۟;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object p1, p0, LYue/ۥۣۢۡۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۥ۟ۨ$ۥ۟;

    return-object p1
.end method

.method public abstract ۥ(LYue/ۥۣۢۡ۠;)V
    .param p1    # LYue/ۥۣۢۡ۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method
