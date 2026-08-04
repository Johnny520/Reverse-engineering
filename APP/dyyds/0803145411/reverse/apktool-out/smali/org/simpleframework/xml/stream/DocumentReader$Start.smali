.class Lorg/simpleframework/xml/stream/DocumentReader$Start;
.super Lorg/simpleframework/xml/stream/EventElement;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/simpleframework/xml/stream/DocumentReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Start"
.end annotation


# instance fields
.field private final element:Lorg/w3c/dom/Element;


# direct methods
.method public constructor <init>(Lorg/w3c/dom/Node;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/simpleframework/xml/stream/EventElement;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lorg/w3c/dom/Element;

    .line 5
    .line 6
    iput-object p1, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getAttributes()Lorg/w3c/dom/NamedNodeMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getLocalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getPrefix()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getReference()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/DocumentReader$Start;->element:Lorg/w3c/dom/Element;

    .line 2
    .line 3
    return-object p0
.end method
