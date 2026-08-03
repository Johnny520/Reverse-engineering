.class public Landroidx/fragment/app/Fragment$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->callStartTransitionListener(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۠ۡ;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/ۥ۟۟۠ۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/fragment/app/Fragment$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$ۥ۟۟۟۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۠ۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ۟۟۟۟;->ۥۣ۟۟۠:Landroidx/fragment/app/ۥ۟۟۠ۡ;

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۠ۡ;->ۥ۟۟۟ۥ()V

    return-void
.end method
