.class public LYue/ۥ۟ۦۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ۥ۟:Ljava/util/HashSet; = null

.field public static ۥ۟۟:Ljava/lang/String; = "RI_EVENT_FILTER"

.field public static ۥ۟۟۟:Ljava/lang/String; = "RI_STREAM_FILTER"

.field public static ۥ۟۟۟۟:Ljava/lang/String; = "javax.xml.stream.notations"

.field public static ۥ۟۟۟۠:Ljava/lang/String; = "javax.xml.stream.entities"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "http://java.sun.com/xml/stream/properties/report-cdata-event"


# instance fields
.field public ۥ:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isValidating"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isCoalescing"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isSupportingExternalEntities"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isRepairingNamespaces"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.isNamespaceAware"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.supportDTD"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.reporter"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.resolver"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "javax.xml.stream.allocator"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    sget-object v1, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    sget-object v1, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۟۠:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    const-string v1, "http://java.sun.com/xml/stream/properties/report-cdata-event"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "javax.xml.stream.isValidating"

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v2, "javax.xml.stream.isCoalescing"

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v3, "javax.xml.stream.isSupportingExternalEntities"

    invoke-virtual {v0, v3, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v3, "javax.xml.stream.isNamespaceAware"

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v2, "javax.xml.stream.supportDTD"

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v2, "javax.xml.stream.isRepairingNamespaces"

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)V
    .locals 3

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unable to access unsupported property "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟()LYue/ۥۢۦۡ;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.allocator"

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۡ;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 1

    const-string v0, "1.0"

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥۢۦۢ۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.reporter"

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۢ۟;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥۢۦۢ۠;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.resolver"

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦۢ۠;

    return-object v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    const-string v0, "javax.xml.stream.isCoalescing"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    const-string v0, "javax.xml.stream.isNamespaceAware"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۥ()Z
    .locals 1

    const-string v0, "javax.xml.stream.isRepairingNamespaces"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, LYue/ۥ۟ۦۧ۟;->ۥ۟:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    const-string v0, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۨ()Z
    .locals 1

    const-string v0, "javax.xml.stream.isSupportingExternalEntities"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠()Z
    .locals 1

    const-string v0, "javax.xml.stream.isValidating"

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۧ۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;Z)V
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    if-eqz p2, :cond_0

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟۠۠(Z)V
    .locals 1

    const-string v0, "javax.xml.stream.isCoalescing"

    invoke-virtual {p0, v0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠۟(Ljava/lang/String;Z)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۢۦۡ;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.allocator"

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟۠ۢ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This implementation does not allow disabling namespace processing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥۣ۟۟۠(Z)V
    .locals 1

    const-string v0, "javax.xml.stream.isRepairingNamespaces"

    invoke-virtual {p0, v0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠۟(Ljava/lang/String;Z)V

    return-void
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "javax.xml.stream.isValidating"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠ۧ(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "javax.xml.stream.isSupportingExternalEntities"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠ۦ(Z)V

    goto :goto_0

    :cond_1
    const-string v0, "javax.xml.stream.isNamespaceAware"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠ۢ(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public ۥ۟۟۠ۥ(Z)V
    .locals 1

    const-string v0, "javax.xml.stream.isReplacingEntityReferences"

    invoke-virtual {p0, v0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۠۟(Ljava/lang/String;Z)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This implementation does not resolve external entities "

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۧ(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This implementation does not support validation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۨ(LYue/ۥۢۦۢ۟;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.reporter"

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟ۡ(LYue/ۥۢۦۢ۠;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۦۧ۟;->ۥ:Ljava/util/Hashtable;

    const-string v1, "javax.xml.stream.resolver"

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
