.class public LYue/ۥ۠ۡۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ۥ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ([Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    aget-object p0, p0, v0

    sput-object p0, LYue/ۥ۠ۡۢۢ;->ۥ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, LYue/ۥ۠ۡۢۢ;->ۥ۟()V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :goto_0
    const-string p0, "javax.xml.stream.XMLInputFactory"

    const-string v0, "com.bea.xml.stream.MXParserFactory"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "javax.xml.stream.XMLOutputFactory"

    const-string v0, "com.bea.xml.stream.XMLOutputFactoryBase"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "javax.xml.stream.XMLEventFactory"

    const-string v0, "com.bea.xml.stream.EventFactory"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object p0

    invoke-static {}, LYue/ۥۢۦۡۨ;->ۥ۟۟۟ۥ()LYue/ۥۢۦۡۨ;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {p0, v2, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۧ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Ljava/io/FileReader;

    sget-object v2, LYue/ۥ۠ۡۢۢ;->ۥ:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;

    move-result-object p0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, LYue/ۥۢۦۡۨ;->ۥ(Ljava/io/OutputStream;)LYue/ۥۢۦۡۥ;

    move-result-object v0

    invoke-interface {v0, p0}, LYue/ۥۢۦۡۥ;->ۥ۟۟۟ۢ(LYue/ۥۢۦۣۡ;)V

    invoke-interface {v0}, LYue/ۥۢۦۡۥ;->flush()V

    return-void
.end method

.method public static ۥ۟()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "usage: java com.bea.xml.stream.samples.EventWrite <xmlfile>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
