.class public LYue/ۥۣۢ۟ۦ;
.super Ljava/io/UncheckedIOException;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/io/IOException;
    .locals 1

    invoke-virtual {p0}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object v0

    return-object v0
.end method
