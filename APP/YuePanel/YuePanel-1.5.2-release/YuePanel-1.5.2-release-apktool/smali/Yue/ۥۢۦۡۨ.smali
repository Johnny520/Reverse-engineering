.class public abstract LYue/ۥۢۦۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String; = "javax.xml.stream.isRepairingNamespaces"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۟ۥ()LYue/ۥۢۦۡۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۡۦ;
        }
    .end annotation

    const-string v0, "javax.xml.stream.XMLOutputFactory"

    const-string v1, "com.bea.xml.stream.XMLOutputFactoryBase"

    invoke-static {v0, v1}, LYue/ۥ۠ۡۦ۠;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۡۨ;

    return-object v0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/ClassLoader;)LYue/ۥۢۦۡۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۡۦ;
        }
    .end annotation

    const-string v0, "com.bea.xml.stream.XMLOutputFactoryBase"

    invoke-static {p0, v0, p1}, LYue/ۥ۠ۡۦ۠;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥۢۦۡۨ;

    return-object p0
.end method


# virtual methods
.method public abstract ۥ(Ljava/io/OutputStream;)LYue/ۥۢۦۡۥ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟(Ljava/io/OutputStream;Ljava/lang/String;)LYue/ۥۢۦۡۥ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟(Ljava/io/Writer;)LYue/ۥۢۦۡۥ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟(Ljavax/xml/transform/Result;)LYue/ۥۢۦۡۥ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۟(Ljava/io/OutputStream;)LYue/ۥۢۦۢۦ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟۠(Ljava/io/OutputStream;Ljava/lang/String;)LYue/ۥۢۦۢۦ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۡ(Ljava/io/Writer;)LYue/ۥۢۦۢۦ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ(Ljavax/xml/transform/Result;)LYue/ۥۢۦۢۦ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۤ(Ljava/lang/String;)Z
.end method

.method public abstract ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation
.end method
