.class public final synthetic LYue/ۥۡۧۤ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/ۥ$ۥ۟۟;


# instance fields
.field public final synthetic ۥ:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۤ۟;->ۥ:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final saveState()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۤ۟;->ۥ:Landroidx/lifecycle/SavedStateHandle;

    invoke-static {v0}, Landroidx/lifecycle/SavedStateHandle;->ۥ(Landroidx/lifecycle/SavedStateHandle;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
