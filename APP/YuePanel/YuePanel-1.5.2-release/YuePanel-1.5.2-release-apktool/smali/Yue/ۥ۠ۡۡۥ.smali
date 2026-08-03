.class public LYue/ۥ۠ۡۡۥ;
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

.method public static final ۥ(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LYue/ۥ۠۠ۥۦ;->ۥ۟(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟([Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    aget-object p0, p0, v0

    sput-object p0, LYue/ۥ۠ۡۡۥ;->ۥ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۥ()V

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    :goto_0
    const-string p0, "javax.xml.stream.XMLInputFactory"

    const-string v0, "com.bea.xml.stream.MXParserFactory"

    invoke-static {p0, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "FACTORY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {p0, v2, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۧ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Ljava/io/FileReader;

    sget-object v2, LYue/ۥ۠ۡۡۥ;->ۥ:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟ۦ(Ljava/io/Reader;)LYue/ۥۢۦۢۤ;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "READER:  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_1
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟۟(LYue/ۥۢۦۢۤ;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->next()I

    goto :goto_1

    :cond_0
    return-void
.end method

.method public static ۥ۟۟(LYue/ۥ۟ۢ۠ۡ;)V
    .locals 3

    invoke-interface {p0}, LYue/ۥ۟ۢ۠ۡ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, LYue/ۥ۟ۢ۠ۡ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, LYue/ۥ۟ۢ۠ۡ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥ۟ۢ۠ۡ;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۟(LYue/ۥۢۦۢۤ;)V
    .locals 2

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۥ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۟(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۢ۠ۡ;

    invoke-static {v0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟۟(LYue/ۥۢۦۢۤ;)V
    .locals 6

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "EVENT:["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠۟()LYue/ۥ۠ۧۧۧ;

    move-result-object v2

    invoke-interface {v2}, LYue/ۥ۠ۧۧۧ;->ۥۣ۟۟۟()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "]["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠۟()LYue/ۥ۠ۧۧۧ;

    move-result-object v2

    invoke-interface {v2}, LYue/ۥ۠ۧۧۧ;->ۥ۟۟۠ۧ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v1

    invoke-static {v1}, LYue/ۥ۠ۡۡۥ;->ۥ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v1

    const/16 v2, 0x9

    const-string v3, "]"

    if-eq v1, v2, :cond_5

    const/16 v2, 0xc

    if-eq v1, v2, :cond_3

    const-string v2, ">"

    const-string v4, "?>"

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const-string v1, "<?xml"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, " version=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, " encoding=\'"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۧ()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, " standalone=\'yes\'"

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p0, " standalone=\'no\'"

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_1
    const-string v1, "<!--"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_1
    const-string p0, "-->"

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_2
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۡ()I

    move-result v1

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡ۟()I

    move-result v2

    new-instance v4, Ljava/lang/String;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟۠()[C

    move-result-object p0

    invoke-direct {v4, p0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_3
    const-string v1, "<?"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-static {p0}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۠(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۤ(Ljava/util/Iterator;)V

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-static {p0}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۠(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۤ(Ljava/util/Iterator;)V

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟(LYue/ۥۢۦۢۤ;)V

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v1, "<![CDATA["

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_4
    const-string p0, "]]>"

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_6
    :goto_1
    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static ۥ۟۟۟۠(I)V
    .locals 3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "EVENT TYPE("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥ۠ۡۡۥ;->ۥ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۟ۡ(LYue/ۥۢۦۢۤ;)V
    .locals 2

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, p0}, LYue/ۥ۠ۡۡۥ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "[\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "\']:"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    if-eqz p0, :cond_1

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_2

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0, p2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static ۥۣ۟۟۟(LYue/ۥۣۡۢ۠;)V
    .locals 4

    invoke-interface {p0}, LYue/ۥۣۡۢ۠;->ۥ۟۟ۤ۠()Z

    move-result v0

    const-string v1, "\'"

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "xmlns=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۣۡۢ۠;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "xmlns:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۣۡۢ۠;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۣۡۢ۠;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۟ۤ(Ljava/util/Iterator;)V
    .locals 2

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۢ۠;

    invoke-static {v0}, LYue/ۥ۠ۡۡۥ;->ۥۣ۟۟۟(LYue/ۥۣۡۢ۠;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟ۥ()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "usage: java com.bea.xml.stream.samples.EventParse <xmlfile>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۟ۦ(LYue/ۥۢۦۢۤ;)V
    .locals 3

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "HAS VALUE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "HAS NO VALUE"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
