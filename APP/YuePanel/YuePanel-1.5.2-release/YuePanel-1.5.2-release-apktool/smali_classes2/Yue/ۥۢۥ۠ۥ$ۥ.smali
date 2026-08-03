.class public LYue/ۥۢۥ۠ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۤ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "xmlns"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "xmlns:"


# instance fields
.field public final ۥ:Lorg/w3c/dom/Document;

.field public ۥ۟:Z

.field public final ۥ۟۟:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Lorg/w3c/dom/Node;

.field public ۥ۟۟۟۟:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

.field public final ۥ۟۟۟۠:LYue/ۥ۠۠ۥۥ;


# direct methods
.method public constructor <init>(Lorg/w3c/dom/Document;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟:Z

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    sget-object v1, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    iput-object v1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    iput-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;

    const-string v1, "jsoupContextSource"

    invoke-interface {p1, v1}, Lorg/w3c/dom/Node;->getUserData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠۠ۥۥ;

    iput-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠۠ۥۥ;

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۥ()LYue/ۥ۠۟ۧۥ;

    move-result-object p1

    iget-boolean v1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۥ()LYue/ۥۣۡۧۦ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۣۡۧۦ;->ۥ۟۟()LYue/ۥۢۢۡۧ;

    move-result-object p1

    instance-of p1, p1, LYue/ۥ۠ۤۧۡ;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    const-string v0, ""

    const-string v1, "http://www.w3.org/1999/xhtml"

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۢۥ۠ۥ$ۥ;Z)Z
    .locals 0

    iput-boolean p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟:Z

    return p1
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۢۥ۠ۥ$ۥ;LYue/ۥ۠۟ۧۥ$ۥ$ۥ;)LYue/ۥ۠۟ۧۥ$ۥ$ۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    return-object p1
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۡۢۤ;I)V
    .locals 4

    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {p2, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p2, p1, LYue/ۥ۠۠ۥۥ;

    if-eqz p2, :cond_3

    check-cast p1, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {p0, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;)Ljava/lang/String;

    move-result-object p2

    iget-boolean v0, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۟()Ljava/lang/String;

    move-result-object v0

    if-nez p2, :cond_1

    :try_start_0
    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p2, ""

    :cond_1
    iget-object v2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    invoke-interface {v2, p2, v0}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۠(LYue/ۥۣۡۢۤ;Lorg/w3c/dom/Element;)V

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V

    iget-object v2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠۠ۥۥ;

    if-ne p1, v2, :cond_2

    iget-object v2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    const-string v3, "jsoupContextNode"

    invoke-interface {v2, v3, p2, v1}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    :cond_2
    iput-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;
    :try_end_0
    .catch Lorg/w3c/dom/DOMException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V

    goto :goto_1

    :cond_3
    instance-of p2, p1, LYue/ۥۢۡ۠ۦ;

    if-eqz p2, :cond_4

    check-cast p1, LYue/ۥۢۡ۠ۦ;

    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    invoke-virtual {p1}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V

    goto :goto_1

    :cond_4
    instance-of p2, p1, LYue/ۥ۟ۥۤۤ;

    if-eqz p2, :cond_5

    check-cast p1, LYue/ۥ۟ۥۤۤ;

    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    invoke-virtual {p1}, LYue/ۥ۟ۥۤۤ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V

    goto :goto_1

    :cond_5
    instance-of p2, p1, LYue/ۥ۟ۨۢۥ;

    if-eqz p2, :cond_6

    check-cast p1, LYue/ۥ۟ۨۢۥ;

    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ:Lorg/w3c/dom/Document;

    invoke-virtual {p1}, LYue/ۥ۟ۨۢۥ;->ۥ۟۟ۦۡ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public ۥ۟(LYue/ۥۣۡۢۤ;I)V
    .locals 0

    instance-of p1, p1, LYue/ۥ۠۠ۥۥ;

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;

    invoke-interface {p1}, Lorg/w3c/dom/Node;->getParentNode()Lorg/w3c/dom/Node;

    move-result-object p1

    instance-of p1, p1, Lorg/w3c/dom/Element;

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;

    invoke-interface {p1}, Lorg/w3c/dom/Node;->getParentNode()Lorg/w3c/dom/Node;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    return-void
.end method

.method public final ۥ۟۟۟۟(Lorg/w3c/dom/Node;LYue/ۥۣۡۢۤ;)V
    .locals 2

    const-string v0, "jsoupSource"

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    iget-object p2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟:Lorg/w3c/dom/Node;

    invoke-interface {p2, p1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    return-void
.end method

.method public final ۥ۟۟۟۠(LYue/ۥۣۡۢۤ;Lorg/w3c/dom/Element;)V
    .locals 3

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟ۢ۠ۤ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۢ۠ۢ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    invoke-static {v1, v2}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ$ۥ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۤ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۢ۠ۢ;

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v3

    const-string v4, "xmlns"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "xmlns:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x6

    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-object v3, p0, LYue/ۥۢۥ۠ۥ$ۥ;->ۥ۟۟:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۢ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۟()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۟()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_3
    return-object v2
.end method
