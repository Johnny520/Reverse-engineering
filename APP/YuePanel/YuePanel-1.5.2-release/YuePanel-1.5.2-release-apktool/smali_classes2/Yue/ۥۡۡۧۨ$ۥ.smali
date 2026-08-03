.class public final LYue/ۥۡۡۧۨ$ۥ;
.super LYue/ۥۡۡۧۨ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟ۡ:LYue/ۥۣ۟ۨ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟ۡ۟:LYue/ۥۡۡۧۨ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۧۨ;

    invoke-direct {p0, p1, p2}, LYue/ۥۡۡۧۨ$ۥ۟۟;-><init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V

    iput-object p3, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۨ۟;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LockCont["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۨ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۧۨ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    invoke-interface {v0, v1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۦۦ()Z
    .locals 5

    invoke-virtual {p0}, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟ۦۥ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۨ۟;

    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance v3, LYue/ۥۡۡۧۨ$ۥ$ۥ;

    iget-object v4, p0, LYue/ۥۡۡۧۨ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۧۨ;

    invoke-direct {v3, v4, p0}, LYue/ۥۡۡۧۨ$ۥ$ۥ;-><init>(LYue/ۥۡۡۧۨ;LYue/ۥۡۡۧۨ$ۥ;)V

    const/4 v4, 0x0

    invoke-interface {v0, v2, v4, v3}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
