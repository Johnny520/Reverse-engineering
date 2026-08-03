.class public Landroidx/activity/ComponentActivity$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity$ۥ;->ۥ۟۟۟۠(ILYue/ۥ۟۟ۨۢ;Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:I

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨۢ$ۥ;

.field public final synthetic ۥ۟۟۠ۥ:Landroidx/activity/ComponentActivity$ۥ;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity$ۥ;ILYue/ۥ۟۟ۨۢ$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥ۟۟۠ۥ:Landroidx/activity/ComponentActivity$ۥ;

    iput p2, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥۣ۟۟۠:I

    iput-object p3, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨۢ$ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥ۟۟۠ۥ:Landroidx/activity/ComponentActivity$ۥ;

    iget v1, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥۣ۟۟۠:I

    iget-object v2, p0, Landroidx/activity/ComponentActivity$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨۢ$ۥ;

    invoke-virtual {v2}, LYue/ۥ۟۟ۨۢ$ۥ;->ۥ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/activity/result/ActivityResultRegistry;->ۥ۟۟(ILjava/lang/Object;)Z

    return-void
.end method
