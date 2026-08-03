.class public LYue/ۥ۟۟۠ۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۤۦۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public final synthetic ۥ۟۟:LYue/ۥ۟۟۠ۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟۟:LYue/ۥ۟۟۠ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ:Z

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ:Z

    return-void
.end method

.method public ۥ۟(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟۟:LYue/ۥ۟۟۠ۢ;

    const/4 v0, 0x0

    iput-object v0, p1, LYue/ۥ۟۟۠ۢ;->ۥ۟۟۠ۨ:LYue/ۥۢۤۦۦ;

    iget v0, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟:I

    invoke-static {p1, v0}, LYue/ۥ۟۟۠ۢ;->ۥ۟(LYue/ۥ۟۟۠ۢ;I)V

    return-void
.end method

.method public ۥ۟۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟۟:LYue/ۥ۟۟۠ۢ;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥ۟۟۠ۢ;->ۥ(LYue/ۥ۟۟۠ۢ;I)V

    iput-boolean v0, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ:Z

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۢۤۦۦ;I)LYue/ۥ۟۟۠ۢ$ۥ۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟۟:LYue/ۥ۟۟۠ۢ;

    iput-object p1, v0, LYue/ۥ۟۟۠ۢ;->ۥ۟۟۠ۨ:LYue/ۥۢۤۦۦ;

    iput p2, p0, LYue/ۥ۟۟۠ۢ$ۥ۟;->ۥ۟:I

    return-object p0
.end method
