.class public LYue/ۥۢۥ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥ۠ۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/String; = "jsoupSource"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "jsoupContextSource"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "jsoupContextNode"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "javax.xml.xpath.XPathFactory:jsoup"


# instance fields
.field public ۥ:Ljavax/xml/parsers/DocumentBuilderFactory;

.field public ۥ۟:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۥ۠ۥ;->ۥ۟:Z

    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۢۥ۠ۥ;->ۥ:Ljavax/xml/parsers/DocumentBuilderFactory;

    invoke-virtual {v1, v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    return-void
.end method

.method public static ۥ()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "html"

    invoke-static {v0}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "xml"

    invoke-static {v0}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟(Lorg/w3c/dom/Document;Ljava/util/Map;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Document;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljavax/xml/transform/dom/DOMSource;

    invoke-direct {v0, p0}, Ljavax/xml/transform/dom/DOMSource;-><init>(Lorg/w3c/dom/Node;)V

    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    new-instance v2, Ljavax/xml/transform/stream/StreamResult;

    invoke-direct {v2, v1}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/Writer;)V

    invoke-static {}, Ljavax/xml/transform/TransformerFactory;->newInstance()Ljavax/xml/transform/TransformerFactory;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/xml/transform/TransformerFactory;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object v3

    if-eqz p1, :cond_0

    invoke-static {p1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۨ(Ljava/util/Map;)Ljava/util/Properties;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljavax/xml/transform/Transformer;->setOutputProperties(Ljava/util/Properties;)V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-interface {p0}, Lorg/w3c/dom/Document;->getDoctype()Lorg/w3c/dom/DocumentType;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Lorg/w3c/dom/Document;->getDoctype()Lorg/w3c/dom/DocumentType;

    move-result-object p0

    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getPublicId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "doctype-public"

    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getPublicId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getSystemId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "doctype-system"

    if-nez p1, :cond_2

    :try_start_1
    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getSystemId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, v4, p0}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v5, "html"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getPublicId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Lorg/w3c/dom/DocumentType;->getSystemId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "about:legacy-compat"

    invoke-virtual {v3, v4, p0}, Ljavax/xml/transform/Transformer;->setOutputProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {v3, v0, v2}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljavax/xml/transform/TransformerException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :goto_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۥ۟۟۟۠(LYue/ۥ۠۟ۧۥ;)Lorg/w3c/dom/Document;
    .locals 1

    new-instance v0, LYue/ۥۢۥ۠ۥ;

    invoke-direct {v0}, LYue/ۥۢۥ۠ۥ;-><init>()V

    invoke-virtual {v0, p0}, LYue/ۥۢۥ۠ۥ;->ۥۣ۟۟۟(LYue/ۥ۠۟ۧۥ;)Lorg/w3c/dom/Document;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "method"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ۥ۟۟۟ۨ(Ljava/util/Map;)Ljava/util/Properties;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Properties;"
        }
    .end annotation

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v0, p0}, Ljava/util/Properties;->putAll(Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public ۥ۟۟(Lorg/w3c/dom/Document;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟(Lorg/w3c/dom/Document;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۟(Lorg/w3c/dom/Document;)Lorg/w3c/dom/Node;
    .locals 1

    const-string v0, "jsoupContextNode"

    invoke-interface {p1, v0}, Lorg/w3c/dom/Node;->getUserData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/w3c/dom/Node;

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠۟ۧۥ;Lorg/w3c/dom/Document;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۢ(LYue/ۥ۠۠ۥۥ;Lorg/w3c/dom/Document;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۠۠ۥۥ;Lorg/w3c/dom/Document;)V
    .locals 3

    new-instance v0, LYue/ۥۢۥ۠ۥ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥۢۥ۠ۥ$ۥ;-><init>(Lorg/w3c/dom/Document;)V

    iget-boolean v1, p0, LYue/ۥۢۥ۠ۥ;->ۥ۟:Z

    invoke-static {v0, v1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟(LYue/ۥۢۥ۠ۥ$ۥ;Z)Z

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۥ()LYue/ۥ۠۟ۧۥ;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Lorg/w3c/dom/Document;->setDocumentURI(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object p2

    invoke-virtual {p2}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    move-result-object p2

    invoke-static {v0, p2}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟(LYue/ۥۢۥ۠ۥ$ۥ;LYue/ۥ۠۟ۧۥ$ۥ$ۥ;)LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    :cond_1
    instance-of p2, p1, LYue/ۥ۠۟ۧۥ;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object p1

    :cond_2
    invoke-static {v0, p1}, LYue/ۥۣۡۢۨ;->ۥ۟۟۟(LYue/ۥۡۢۤ۟;LYue/ۥۣۡۢۤ;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠۟ۧۥ;)Lorg/w3c/dom/Document;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۤ(LYue/ۥ۠۠ۥۥ;)Lorg/w3c/dom/Document;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠۠ۥۥ;)Lorg/w3c/dom/Document;
    .locals 7

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, LYue/ۥۢۥ۠ۥ;->ۥ:Ljavax/xml/parsers/DocumentBuilderFactory;

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->getDOMImplementation()Lorg/w3c/dom/DOMImplementation;

    move-result-object v1

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->newDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۥ()LYue/ۥ۠۟ۧۥ;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۧ()LYue/ۥ۠۟ۧۧ;

    move-result-object v4
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_1

    :try_start_1
    invoke-virtual {v4}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦۡ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦۤ()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v5, v6, v4}, Lorg/w3c/dom/DOMImplementation;->createDocumentType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/DocumentType;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
    :try_end_1
    .catch Lorg/w3c/dom/DOMException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_1
    :cond_1
    const/4 v1, 0x1

    :try_start_2
    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->setXmlStandalone(Z)V

    instance-of v1, p1, LYue/ۥ۠۟ۧۥ;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, p1

    :goto_1
    const-string v4, "jsoupContextSource"

    invoke-interface {v0, v4, v1, v3}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    if-eqz v2, :cond_3

    move-object p1, v2

    :cond_3
    invoke-virtual {p0, p1, v0}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۟ۢ(LYue/ۥ۠۠ۥۥ;Lorg/w3c/dom/Document;)V
    :try_end_2
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥ۟۟۟ۦ(Z)LYue/ۥۢۥ۠ۥ;
    .locals 1

    iput-boolean p1, p0, LYue/ۥۢۥ۠ۥ;->ۥ۟:Z

    iget-object v0, p0, LYue/ۥۢۥ۠ۥ;->ۥ:Ljavax/xml/parsers/DocumentBuilderFactory;

    invoke-virtual {v0, p1}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    return-object p0
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥ۠ۥ;->ۥ۟:Z

    return v0
.end method

.method public ۥ۟۟۠(Ljava/lang/String;Lorg/w3c/dom/Document;)Lorg/w3c/dom/NodeList;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۥ۠ۥ;->ۥ۟۟۠۟(Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/NodeList;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/NodeList;
    .locals 2

    const-string v0, "xpath"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "contextNode"

    invoke-static {p2, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "javax.xml.xpath.XPathFactory:jsoup"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "jsoup"

    invoke-static {v0}, Ljavax/xml/xpath/XPathFactory;->newInstance(Ljava/lang/String;)Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_1

    :cond_0
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v0

    invoke-interface {v0, p1}, Ljavax/xml/xpath/XPath;->compile(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;

    move-result-object v0

    sget-object v1, Ljavax/xml/xpath/XPathConstants;->NODESET:Ljavax/xml/namespace/QName;

    invoke-interface {v0, p2, v1}, Ljavax/xml/xpath/XPathExpression;->evaluate(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/w3c/dom/NodeList;

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljavax/xml/xpath/XPathExpressionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/xml/xpath/XPathFactoryConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :goto_1
    new-instance v0, LYue/ۥۡۨ۟ۡ$ۥ;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Could not evaluate XPath query [%s]: %s"

    invoke-direct {v0, p2, v1, p1}, LYue/ۥۡۨ۟ۡ$ۥ;-><init>(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public ۥ۟۟۠۠(Lorg/w3c/dom/NodeList;Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">(",
            "Lorg/w3c/dom/NodeList;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v2

    const-string v3, "jsoupSource"

    invoke-interface {v2, v3}, Lorg/w3c/dom/Node;->getUserData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۡۢۤ;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
