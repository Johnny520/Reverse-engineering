.class public final LYue/ۥۣ۟ۥۣ$ۥ;
.super LYue/ۥۣ۟ۥۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۥۣ;->ۥ۟۟۠(Ljava/io/BufferedInputStream;)LYue/ۥۣ۟ۥۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Z

.field public final synthetic ۥ۟۟۠ۦ:Ljava/io/BufferedInputStream;


# direct methods
.method public constructor <init>(Ljava/io/BufferedInputStream;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۦ:Ljava/io/BufferedInputStream;

    invoke-direct {p0}, LYue/ۥۣ۟ۥۡ;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۟()V

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ۥ۟()B
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۟()V

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_0

    iget v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۠:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۤ:Z

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Input stream is over."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public final ۥ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۠:I

    return v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۤ:Z

    return v0
.end method

.method public final ۥۣ۟۟۟()V
    .locals 3

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۤ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۦ:Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I

    move-result v0

    iput v0, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۠:I

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۤ:Z

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۥ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public final ۥ۟۟۟ۦ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method

.method public final ۥ۟۟۟ۧ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟ۥۣ$ۥ;->ۥ۟۟۠ۤ:Z

    return-void
.end method
