.class public LYue/ۥۡۦۧۦ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۧۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:I

.field public final ۥ۟۟۠ۤ:Landroid/os/Bundle;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۦۧۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۧۦ;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥۣ۟۟۠:I

    iput-object p3, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧۦ;

    iget v1, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥۣ۟۟۠:I

    iget-object v2, p0, LYue/ۥۡۦۧۦ$ۥ۟۟;->ۥ۟۟۠ۤ:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۦۧۦ;->ۥ(ILandroid/os/Bundle;)V

    return-void
.end method
