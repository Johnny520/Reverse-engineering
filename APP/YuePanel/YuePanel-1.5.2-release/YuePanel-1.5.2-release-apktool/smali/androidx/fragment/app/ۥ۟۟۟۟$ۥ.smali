.class public Landroidx/fragment/app/ۥ۟۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟۟;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-static {v0}, Landroidx/fragment/app/ۥ۟۟۟۟;->access$100(Landroidx/fragment/app/ۥ۟۟۟۟;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-static {v1}, Landroidx/fragment/app/ۥ۟۟۟۟;->access$000(Landroidx/fragment/app/ۥ۟۟۟۟;)Landroid/app/Dialog;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method
