.class public final LYue/ۥۣ۟ۧۨ;
.super LYue/ۥۣ۟ۧۦ;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۨ۟ۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>(LYue/ۥۡۨ۟ۦ;I)V
    .locals 0
    .param p1    # LYue/ۥۡۨ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۣ۟ۧۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥۡۨ۟ۦ;

    iput p2, p0, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۧۨ;->ۥ۟۟(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CancelSemaphoreAcquisitionHandler["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥۡۨ۟ۦ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۠ۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۣ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥۡۨ۟ۦ;

    iget v0, p0, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, v0}, LYue/ۥۡۨ۟ۦ;->ۥ۟۟۠ۢ(I)V

    return-void
.end method
