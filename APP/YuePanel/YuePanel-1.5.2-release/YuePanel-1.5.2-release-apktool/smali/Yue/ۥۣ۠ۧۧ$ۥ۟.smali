.class public LYue/ۥۣ۠ۧۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/Observer<",
        "TD;>;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۠ۧۥ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠ۧۦ$ۥ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟:Z


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۧۥ;LYue/ۥۣ۠ۧۦ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۧۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟:Z

    iput-object p1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    iput-object p2, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟:LYue/ۥۣ۠ۧۦ$ۥ;

    return-void
.end method


# virtual methods
.method public onChanged(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  onLoadFinished in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v1, p1}, LYue/ۥۣ۠ۧۥ;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟:LYue/ۥۣ۠ۧۦ$ۥ;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-interface {v0, v1, p1}, LYue/ۥۣ۠ۧۦ$ۥ;->ۥ۟۟(LYue/ۥۣ۠ۧۥ;Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟:LYue/ۥۣ۠ۧۦ$ۥ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 0

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mDeliveredData="

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟:Z

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method public ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟:Z

    return v0
.end method

.method public ۥ۟۟()V
    .locals 2
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟۟:Z

    if-eqz v0, :cond_1

    sget-boolean v0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Resetting: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ۟:LYue/ۥۣ۠ۧۦ$ۥ;

    iget-object v1, p0, LYue/ۥۣ۠ۧۧ$ۥ۟;->ۥ:LYue/ۥۣ۠ۧۥ;

    invoke-interface {v0, v1}, LYue/ۥۣ۠ۧۦ$ۥ;->ۥ(LYue/ۥۣ۠ۧۥ;)V

    :cond_1
    return-void
.end method
