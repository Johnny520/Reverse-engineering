.class public LYue/ۥۢۦۢۧ;
.super LYue/ۥۡۦ۠;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦۢۦ;


# static fields
.field public static final ۥ۟۟۠:Ljava/lang/String; = ""


# instance fields
.field public ۥ۟:Ljava/io/Writer;

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:LYue/ۥ۟ۦۧ۟;

.field public ۥ۟۟۟۠:Ljava/nio/charset/CharsetEncoder;

.field public ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

.field public ۥ۟۟۟ۢ:LYue/ۥۣۢ۟ۧ;

.field public ۥۣ۟۟۟:LYue/ۥۣۢ۟ۧ;

.field public ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

.field public ۥ۟۟۟ۥ:Ljava/util/HashSet;

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:I

.field public ۥ۟۟۟ۨ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, LYue/ۥۡۦ۠;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    .line 3
    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    .line 4
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

    .line 5
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۢ۟ۧ;

    .line 6
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۟:LYue/ۥۣۢ۟ۧ;

    .line 7
    new-instance v1, LYue/ۥۡۢ۠ۦ;

    invoke-direct {v1}, LYue/ۥۡۢ۠ۦ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    .line 8
    iput v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ:I

    .line 9
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۨ:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 2

    .line 10
    invoke-direct {p0}, LYue/ۥۡۦ۠;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    .line 12
    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    .line 13
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

    .line 14
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۢ۟ۧ;

    .line 15
    new-instance v1, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v1}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۟:LYue/ۥۣۢ۟ۧ;

    .line 16
    new-instance v1, LYue/ۥۡۢ۠ۦ;

    invoke-direct {v1}, LYue/ۥۡۢ۠ۦ;-><init>()V

    iput-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    .line 17
    iput v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ:I

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۨ:Ljava/util/HashSet;

    .line 19
    iput-object p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    .line 20
    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۟(Ljava/io/Writer;)V

    return-void
.end method

.method public static ۥ۟۟ۡۡ([Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LYue/ۥۢۦۡۨ;->ۥ۟۟۟ۥ()LYue/ۥۢۦۡۨ;

    move-result-object p0

    new-instance v0, Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V

    const-string v2, "javax.xml.stream.isRepairingNamespaces"

    invoke-virtual {p0, v2, v0}, LYue/ۥۢۦۡۨ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    const-string v3, "tmp"

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    const-string v3, "us-ascii"

    invoke-direct {v0, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LYue/ۥۢۦۡۨ;->ۥ۟۟۟ۡ(Ljava/io/Writer;)LYue/ۥۢۦۢۦ;

    move-result-object p0

    invoke-interface {p0}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۢ()V

    const-string v0, "c"

    const-string v2, "http://c"

    invoke-interface {p0, v0, v2}, LYue/ۥۢۦۢۦ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "http://d"

    invoke-interface {p0, v0}, LYue/ۥۢۦۢۦ;->ۥ۟۟(Ljava/lang/String;)V

    const-string v3, "a"

    invoke-interface {p0, v2, v3}, LYue/ۥۢۦۢۦ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "b"

    const-string v4, "blah"

    invoke-interface {p0, v3, v4}, LYue/ۥۢۦۢۦ;->ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "d"

    invoke-interface {p0, v2, v3}, LYue/ۥۢۦۢۦ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "e"

    invoke-interface {p0, v0, v3}, LYue/ۥۢۦۢۦ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "http://e"

    const-string v3, "f"

    invoke-interface {p0, v0, v3}, LYue/ۥۢۦۢۦ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "http://f"

    const-string v3, "g"

    invoke-interface {p0, v0, v3}, LYue/ۥۢۦۢۦ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "chris"

    const-string v3, "fry"

    invoke-interface {p0, v2, v0, v3}, LYue/ۥۢۦۢۦ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "foo bar foo"

    invoke-interface {p0, v0}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۨ(Ljava/lang/String;)V

    const-string v0, "bad char coming["

    invoke-interface {p0, v0}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۨ(Ljava/lang/String;)V

    new-array v0, v1, [C

    const/16 v1, 0x1024

    const/4 v2, 0x0

    aput-char v1, v0, v2

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    invoke-interface {p0, v1}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۨ(Ljava/lang/String;)V

    const-string v0, "]"

    invoke-interface {p0, v0}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۨ(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۦ;->ۥ۟۟۠ۤ()V

    invoke-interface {p0}, LYue/ۥۢۦۢۦ;->flush()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->flush()V

    return-void
.end method

.method public flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, LYue/ۥۢۦۢۢ;

    invoke-direct {v1, v0}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۢ۠ۦ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۟:LYue/ۥ۟ۦۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۢ(Ljava/lang/String;)Z

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟()LYue/ۥۡۢ۠ۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۢ(Ljava/lang/String;)Z

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۢ۠ۦ;->ۥ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "<?xml version=\'"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, "\'?>"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ""

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, " xmlns"

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v1, "=\""

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v1, "\""

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۦۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string v0, "A start element must be written before the default namespace"

    invoke-direct {p1, v0}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۡۢ۠ۥ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, LYue/ۥۡۢ۠ۦ;

    invoke-direct {v0, p1}, LYue/ۥۡۢ۠ۦ;-><init>(LYue/ۥۡۢ۠ۥ;)V

    iput-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "The namespace  context may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۥ()V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    const-string v0, "<"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "=\""

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p4, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۥ([CIIZ)V

    const-string p1, "\""

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string p2, "A start element must be written before an attribute"

    invoke-direct {p1, p2}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const-string v0, "<?"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    const/16 p1, 0x20

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_1
    const-string p1, "?>"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

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

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "xmlns"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " xmlns:"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "=\""

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, "\""

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۟(Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string p2, "A start element must be written before a namespace"

    invoke-direct {p1, p2}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۥ()V

    invoke-virtual {p0, p3}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    const/4 p3, 0x1

    iput-boolean p3, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    const-string p3, "<"

    invoke-virtual {p0, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, ":"

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "=\""

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۥ([CIIZ)V

    const-string p1, "\""

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, LYue/ۥۢۦۢۢ;

    const-string p2, "A start element must be written before an attribute"

    invoke-direct {p1, p2}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    if-eqz p3, :cond_2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۤ()V

    invoke-virtual {p0, p3}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1, p3}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The prefix may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The local name may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The namespace URI may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const-string v0, "&"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, ";"

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

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const-string v0, "<![CDATA["

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    const-string p1, "]]>"

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

    const-string v0, "<?xml version=\'"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p2, "\' encoding=\'"

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p1, "\'?>"

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

    const-string v0, "<!--"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_0
    const-string p1, "-->"

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

    const-string v0, "<?xml version=\'1.0\' encoding=\'utf-8\'?>"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۤ()V

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۤ()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    :cond_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v1}, LYue/ۥۣۢ۟ۧ;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v2}, LYue/ۥۣۢ۟ۧ;->pop()Ljava/lang/Object;

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۤ()V

    const-string v2, ""

    invoke-virtual {p0, v0, v2, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۦ()V

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟۟()V

    return-void
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :goto_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟۠ۤ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۦ(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۤ()V

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۧ(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, v0, v1, p1, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۥ([CIIZ)V

    return-void
.end method

.method public ۥ۟۟ۡ(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, ""

    invoke-virtual {p0, v0, p1, p2}, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۡ۠([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۥ([CIIZ)V

    return-void
.end method

.method public final ۥ۟۟ۡۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۨ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public ۥ۟۟ۡۦ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, ">"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۡۧ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۨ()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡۨ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢ()V

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۥ()V

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    const-string v0, "/>"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟:Z

    goto :goto_0

    :cond_0
    const-string v0, ">"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۢ()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۦ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v2, v1}, LYue/ۥۡۢ۠ۦ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v2, v1}, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۢۦۢۢ;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Unable to default prefix with uri:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۥ۟۟ۢ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۢ۠ۦ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public ۥ۟۟ۢ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۤ:LYue/ۥۡۢ۠ۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public ۥ۟۟ۢۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    return v0
.end method

.method public final ۥ۟۟ۢۢ(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return v0
.end method

.method public final ۥۣ۟۟ۢ(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۨ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۨ:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return v0
.end method

.method public ۥ۟۟ۢۤ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "</"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۥ۟۟ۢۥ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۨ()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟:Z

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۢۦ()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const-string v0, "<"

    invoke-virtual {p0, v0}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۥ۟۟ۢۧ(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۦ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ:I

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "ns"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۦۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۥ۟۟ۢۨ(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۦ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۥ:Ljava/util/HashSet;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public ۥۣ۟۟(LYue/ۥ۟ۦۧ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۟:LYue/ۥ۟ۦۧ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۟ۥ()Z

    move-result p1

    iput-boolean p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۦ:Z

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/io/Writer;)V
    .locals 1

    iput-object p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {p0, p0}, LYue/ۥۡۦ۠;->ۥ۟۟ۡۢ(LYue/ۥۢۦۢۦ;)V

    instance-of v0, p1, Ljava/io/OutputStreamWriter;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/OutputStreamWriter;

    invoke-virtual {p1}, Ljava/io/OutputStreamWriter;->getEncoding()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۠:Ljava/nio/charset/CharsetEncoder;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۠:Ljava/nio/charset/CharsetEncoder;

    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟۠([CIIZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_7

    add-int v1, v0, p2

    aget-char v1, p1, v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_5

    const/16 v2, 0x26

    if-eq v1, v2, :cond_4

    const/16 v2, 0x3c

    if-eq v1, v2, :cond_3

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_2

    const/16 v2, 0x20

    const/16 v3, 0x3b

    const-string v4, "&#"

    if-ge v1, v2, :cond_1

    if-nez p4, :cond_0

    const/16 v2, 0x9

    if-eq v1, v2, :cond_6

    const/16 v2, 0xa

    if-eq v1, v2, :cond_6

    :cond_0
    invoke-virtual {p0, v4}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    goto :goto_1

    :cond_1
    const/16 v2, 0x7f

    if-le v1, v2, :cond_6

    iget-object v2, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۠:Ljava/nio/charset/CharsetEncoder;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p0, v4}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    goto :goto_1

    :cond_2
    const-string v1, "&gt;"

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v1, "&lt;"

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v1, "&amp;"

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    if-eqz p4, :cond_6

    const-string v1, "&quot;"

    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0, v1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۡ(C)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public ۥۣ۟۟ۡ(C)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, LYue/ۥۢۦۢۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, LYue/ۥۢۦۢۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥۣۣ۟۟([C)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write([C)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, LYue/ۥۢۦۢۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥۣ۟۟ۤ([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, LYue/ۥۢۦۢۢ;

    invoke-direct {p2, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public ۥۣ۟۟ۥ([CIIZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_4

    add-int v1, v0, p2

    aget-char v1, p1, v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_2

    const/16 v2, 0x26

    if-eq v1, v2, :cond_4

    const/16 v2, 0x3c

    if-eq v1, v2, :cond_4

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_4

    const/16 v2, 0x20

    if-ge v1, v2, :cond_1

    if-nez p4, :cond_4

    const/16 v2, 0x9

    if-eq v1, v2, :cond_3

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_1
    const/16 v2, 0x7f

    if-le v1, v2, :cond_3

    iget-object v2, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟۠:Ljava/nio/charset/CharsetEncoder;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_2
    if-nez p4, :cond_4

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    if-ge v0, p3, :cond_5

    invoke-virtual {p0, p1, p2, p3, p4}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۠([CIIZ)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۤ([CII)V

    :goto_2
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

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    const-string p2, ":"

    invoke-virtual {p0, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, p3}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-object p1
.end method

.method public ۥۣ۟۟ۧ(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۡۧ()V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۢ(Ljava/lang/String;)V

    return-void
.end method

.method public ۥۣ۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۥ()V

    invoke-virtual {p0}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۦ()V

    invoke-virtual {p0, p1}, LYue/ۥۢۦۢۧ;->ۥ۟۟ۢۧ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۢ۟ۧ;

    const-string v1, ""

    invoke-virtual {p0, v1, p1, p2}, LYue/ۥۢۦۢۧ;->ۥۣ۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۢۦۢۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0, p2}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۢۦۢۧ;->ۥۣ۟۟۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {p2, p1}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The local name  may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The namespace URI may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
