.class public final Ln/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/Writer;

.field private final b:I

.field private final c:Ljava/lang/StringBuffer;

.field private final d:Ljava/lang/StringBuffer;

.field private final e:Ln/f;

.field private final f:Ln/f;


# direct methods
.method public constructor <init>(Ljava/io/StringWriter;IILjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-lt p2, v0, :cond_1

    if-lt p3, v0, :cond_0

    new-instance v0, Ljava/io/StringWriter;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2, v1}, Ljava/io/StringWriter;-><init>(I)V

    iput-object p1, p0, Ln/l;->a:Ljava/io/Writer;

    iput p2, p0, Ln/l;->b:I

    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Ln/l;->c:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Ln/l;->d:Ljava/lang/StringBuffer;

    new-instance p1, Ln/f;

    const-string v1, ""

    invoke-direct {p1, v0, p2, v1}, Ln/f;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    iput-object p1, p0, Ln/l;->e:Ln/f;

    new-instance p1, Ln/f;

    invoke-direct {p1, v2, p3, p4}, Ln/f;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    iput-object p1, p0, Ln/l;->f:Ln/f;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "rightWidth < 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "leftWidth < 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static a(Ljava/lang/StringBuffer;Ln/f;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result p0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    invoke-virtual {p1, v0}, Ln/f;->write(I)V

    :cond_0
    return-void
.end method

.method private c()V
    .locals 8

    :goto_0
    iget-object v0, p0, Ln/l;->c:Ljava/lang/StringBuffer;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_0

    return-void

    :cond_0
    iget-object v3, p0, Ln/l;->d:Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_1

    return-void

    :cond_1
    const/4 v4, 0x0

    iget-object v5, p0, Ln/l;->a:Ljava/io/Writer;

    if-eqz v2, :cond_2

    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_2
    if-eqz v1, :cond_4

    iget v6, p0, Ln/l;->b:I

    sub-int/2addr v6, v2

    :goto_1
    if-lez v6, :cond_3

    const/16 v7, 0x20

    invoke-virtual {v5, v7}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v4, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_4
    const/16 v6, 0xa

    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v4, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/io/StringWriter;

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x3

    invoke-direct {v2, v0}, Ljava/io/StringWriter;-><init>(I)V

    new-instance v0, Ln/l;

    const-string v1, ""

    invoke-direct {v0, v2, p1, p3, v1}, Ln/l;-><init>(Ljava/io/StringWriter;IILjava/lang/String;)V

    :try_start_0
    iget-object p1, v0, Ln/l;->e:Ln/f;

    invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object p0, v0, Ln/l;->f:Ln/f;

    invoke-virtual {p0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ln/l;->b()V

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Ln/l;->d:Ljava/lang/StringBuffer;

    iget-object v1, p0, Ln/l;->c:Ljava/lang/StringBuffer;

    iget-object v2, p0, Ln/l;->f:Ln/f;

    iget-object v3, p0, Ln/l;->e:Ln/f;

    :try_start_0
    invoke-static {v1, v3}, Ln/l;->a(Ljava/lang/StringBuffer;Ln/f;)V

    invoke-static {v0, v2}, Ln/l;->a(Ljava/lang/StringBuffer;Ln/f;)V

    invoke-direct {p0}, Ln/l;->c()V

    invoke-static {v1, v3}, Ln/l;->a(Ljava/lang/StringBuffer;Ln/f;)V

    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    const/16 v5, 0xa

    if-eqz v4, :cond_0

    invoke-virtual {v2, v5}, Ln/f;->write(I)V

    invoke-direct {p0}, Ln/l;->c()V

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Ln/l;->a(Ljava/lang/StringBuffer;Ln/f;)V

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3, v5}, Ln/f;->write(I)V

    invoke-direct {p0}, Ln/l;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
