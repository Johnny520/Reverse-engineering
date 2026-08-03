.class public abstract LYue/ۥۢۦۣ۟$ۥ۟;
.super Ljava/io/Reader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۦۣ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/io/InputStream;

.field public ۥ۟۟۠ۤ:[B

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/Reader;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    const/16 p1, 0x2000

    new-array p1, p1, [B

    iput-object p1, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iput v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۤ:[B

    iput-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    :cond_0
    return-void
.end method

.method public ready()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    iget v1, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۦ:I

    iget v2, p0, LYue/ۥۢۦۣ۟$ۥ۟;->ۥ۟۟۠ۥ:I

    sub-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public abstract ۥ۟()Ljava/lang/String;
.end method
