.class public LYue/ۥۣۡۢ۟;
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
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    aget-object p0, p0, v0

    sput-object p0, LYue/ۥۣۡۢ۟;->ۥ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, LYue/ۥۣۡۢ۟;->ۥ۟()V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :goto_0
    const-string p0, "javax.xml.stream.XMLInputFactory"

    const-string v0, "com.bea.xml.stream.MXParserFactory"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "javax.xml.stream.XMLEventFactory"

    const-string v0, "com.bea.xml.stream.EventFactory"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object p0

    new-instance v0, LYue/ۥۢ۠۟ۧ;

    invoke-direct {v0}, LYue/ۥۢ۠۟ۧ;-><init>()V

    invoke-virtual {p0, v0}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۦ(LYue/ۥۢۦۡ;)V

    new-instance v0, Ljava/io/FileReader;

    sget-object v1, LYue/ۥۣۡۢ۟;->ۥ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "ID:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    return-void
.end method

.method public static ۥ۟()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "usage: java com.bea.xml.stream.samples.EventParse <xmlfile>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
