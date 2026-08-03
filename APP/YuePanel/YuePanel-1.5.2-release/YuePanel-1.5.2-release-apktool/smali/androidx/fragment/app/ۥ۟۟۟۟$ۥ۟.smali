.class public Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


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

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1    # Landroid/content/DialogInterface;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-static {p1}, Landroidx/fragment/app/ۥ۟۟۟۟;->access$000(Landroidx/fragment/app/ۥ۟۟۟۟;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-static {p1}, Landroidx/fragment/app/ۥ۟۟۟۟;->access$000(Landroidx/fragment/app/ۥ۟۟۟۟;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/ۥ۟۟۟۟;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
