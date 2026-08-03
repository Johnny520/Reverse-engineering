.class public abstract LYue/ۥۢۦۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String; = "javax.xml.stream.isNamespaceAware"

.field public static final ۥ۟:Ljava/lang/String; = "javax.xml.stream.isValidating"

.field public static final ۥ۟۟:Ljava/lang/String; = "javax.xml.stream.isCoalescing"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "javax.xml.stream.isReplacingEntityReferences"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "javax.xml.stream.isSupportingExternalEntities"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "javax.xml.stream.supportDTD"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "javax.xml.stream.reporter"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "javax.xml.stream.resolver"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "javax.xml.stream.allocator"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۡۦ;
        }
    .end annotation

    const-string v0, "javax.xml.stream.XMLInputFactory"

    const-string v1, "com.bea.xml.stream.MXParserFactory"

    invoke-static {v0, v1}, LYue/ۥ۠ۡۦ۠;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۡۧ;

    return-object v0
.end method

.method public static ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/ClassLoader;)LYue/ۥۢۦۡۧ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۡۦ;
        }
    .end annotation

    const-string v0, "com.bea.xml.stream.MXParserFactory"

    invoke-static {p0, v0, p1}, LYue/ۥ۠ۡۦ۠;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥۢۦۡۧ;

    return-object p0
.end method


# virtual methods
.method public abstract ۥ(LYue/ۥۢۦۣۡ;LYue/ۥ۠ۡ۠ۧ;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۣۢ۠۠;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟(Ljava/io/InputStream;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۟(Ljava/io/InputStream;Ljava/lang/String;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/io/Reader;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟(Ljavax/xml/transform/Source;)LYue/ۥۢۦۣۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۤ(Ljava/io/InputStream;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۥ(Ljava/io/InputStream;Ljava/lang/String;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۦ(Ljava/io/Reader;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/io/Reader;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠(Ljavax/xml/transform/Source;)LYue/ۥۢۦۢۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠۟()LYue/ۥۢۦۡ;
.end method

.method public abstract ۥ۟۟۠۠(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠ۡ()LYue/ۥۢۦۢ۟;
.end method

.method public abstract ۥ۟۟۠ۢ()LYue/ۥۢۦۢ۠;
.end method

.method public abstract ۥۣ۟۟۠(Ljava/lang/String;)Z
.end method

.method public abstract ۥ۟۟۠ۦ(LYue/ۥۢۦۡ;)V
.end method

.method public abstract ۥ۟۟۠ۧ(Ljava/lang/String;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠ۨ(LYue/ۥۢۦۢ۟;)V
.end method

.method public abstract ۥ۟۟ۡ(LYue/ۥۢۦۢ۠;)V
.end method
