.class public final LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;
.super LYue/ۥ۟ۢۦۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۦۡ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e0<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۤ;LYue/ۥۡۦۡ۠;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e0<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;

    invoke-direct {p0}, LYue/ۥ۟ۢۦۧ;-><init>()V

    iput-object p2, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۡۦۡ۠;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥ۟۟(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RemoveReceiveOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۡۦۡ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۡۦۡ۠;

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۨ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:LYue/ۥ۟۟۠ۤ;

    invoke-virtual {p1}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۤۢ()V

    :cond_0
    return-void
.end method
