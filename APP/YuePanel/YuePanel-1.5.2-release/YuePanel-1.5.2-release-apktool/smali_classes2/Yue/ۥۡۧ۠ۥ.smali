.class public final LYue/ۥۡۧ۠ۥ;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:Ljava/io/IOException;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Ljava/io/IOException;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1
    .param p1    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "firstConnectException"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, LYue/ۥۡۧ۠ۥ;->ۥۣ۟۟۠:Ljava/io/IOException;

    iput-object p1, p0, LYue/ۥۡۧ۠ۥ;->ۥ۟۟۠ۤ:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/io/IOException;)V
    .locals 1
    .param p1    # Ljava/io/IOException;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧ۠ۥ;->ۥۣ۟۟۠:Ljava/io/IOException;

    invoke-static {v0, p1}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object p1, p0, LYue/ۥۡۧ۠ۥ;->ۥ۟۟۠ۤ:Ljava/io/IOException;

    return-void
.end method

.method public final ۥ۟()Ljava/io/IOException;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ۠ۥ;->ۥۣ۟۟۠:Ljava/io/IOException;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/io/IOException;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ۠ۥ;->ۥ۟۟۠ۤ:Ljava/io/IOException;

    return-object v0
.end method
