.class public final LYue/ۥۡۦۧ۟$ۥ;
.super Ljava/io/Reader;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۧ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Ljava/io/Reader;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟۠;Ljava/nio/charset/Charset;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iput-object p2, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

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

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۥ:Z

    iget-object v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/io/Reader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    :cond_1
    return-void
.end method

.method public read([CII)I
    .locals 4
    .param p1    # [C
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "cbuf"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/io/Reader;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v1}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟۟()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-object v3, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

    invoke-static {v2, v3}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۢۧ(LYue/ۥۣۣ۟۠;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, LYue/ۥۡۦۧ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/io/Reader;

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
