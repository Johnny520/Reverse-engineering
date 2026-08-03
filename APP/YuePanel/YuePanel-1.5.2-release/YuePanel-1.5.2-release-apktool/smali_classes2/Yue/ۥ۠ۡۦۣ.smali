.class public final LYue/ۥ۠ۡۦۣ;
.super LYue/ۥ۟۟ۢ۟;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۥ:LYue/ۥ۠ۡۦۣ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟۟ۢ۟;-><init>()V

    new-instance v0, LYue/ۥ۠ۡۦۣ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۡۦۣ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡۦۣ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۡۦۣ$ۥ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۠ۡ()Ljava/util/Random;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۦۣ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۡۦۣ$ۥ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
