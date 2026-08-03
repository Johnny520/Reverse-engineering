.class public LYue/ۥۢۦۢۥ;
.super LYue/ۥۢۦۢۧ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۢۦۢۧ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۢۦۢۧ;-><init>(Ljava/io/Writer;)V

    return-void
.end method

.method public static ۥ۟۟ۡۡ([Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object v0

    invoke-static {}, LYue/ۥۢۦۡۨ;->ۥ۟۟۟ۥ()LYue/ۥۢۦۡۨ;

    new-instance v1, Ljava/io/FileReader;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟ۦ(Ljava/io/Reader;)LYue/ۥۢۦۢۤ;

    move-result-object p0

    new-instance v0, LYue/ۥۢۦۢۥ;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    const-string v3, "out.stream"

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۥ;-><init>(Ljava/io/Writer;)V

    :goto_0
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, LYue/ۥۢۦۢۥ;->ۥۣ۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->next()I

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, LYue/ۥۢۦۢۥ;->ۥۣ۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-virtual {v0}, LYue/ۥۢۦۢۧ;->flush()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "[["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, "],[utf-8]]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "[[DEFAULT]["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "xmlns]"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "=["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "]"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۦۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void

    :cond_0
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string v0, "A start element must be written before the default namespace"

    invoke-direct {p1, v0}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-super {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v1, "]"

    if-eqz p1, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, ",["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "xmlns"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "[[NAMESPACE]["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "xmlns:"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "]=["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "]"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۥ;->ۥ۟۟۟۟(Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string p2, "A start element must be written before a namespace"

    invoke-direct {p1, p2}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "[[ATTRIBUTE]"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۢۦۢۥ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "="

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2, p3}, LYue/ۥۢۦۢۥ;->ۥۣ۟۟ۥ([CIIZ)V

    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-super {p0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟۠(Ljava/lang/String;)V

    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠۠(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "[["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p2, "],["

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, "]]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "[[1.0],[utf-8]]"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥۢۦۢۤ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۥ;->ۥ۟۟ۤ(I)V

    invoke-super {p0, p1}, LYue/ۥۡۦ۠;->ۥۣ۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ";\n"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡۦ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void
.end method

.method public ۥ۟۟ۡۨ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "];\n"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۢۤ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void
.end method

.method public ۥ۟۟ۢۦ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void
.end method

.method public ۥۣ۟۟ۥ([CIIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    if-nez p3, :cond_0

    const-string p1, "[]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p4, "["

    invoke-virtual {p0, p4}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۤ([CII)V

    const-string p1, "]"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "[\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "\':"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :goto_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x5d

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-object p1
.end method

.method public ۥ۟۟ۤ(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    invoke-static {p1}, LYue/ۥ۠۠ۥۦ;->ۥ۟(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    return-void
.end method
