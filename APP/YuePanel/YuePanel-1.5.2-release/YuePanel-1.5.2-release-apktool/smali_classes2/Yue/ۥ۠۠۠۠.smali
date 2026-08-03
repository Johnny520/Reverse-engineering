.class public LYue/ۥ۠۠۠۠;
.super LYue/ۥ۠۠۠۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠۠۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠:Ljava/lang/String; = "Sec-WebSocket-Key"

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "Sec-WebSocket-Protocol"

.field public static final ۥ۟۟۠۠:Ljava/lang/String; = "Sec-WebSocket-Extensions"

.field public static final ۥ۟۟۠ۡ:Ljava/lang/String; = "Sec-WebSocket-Accept"

.field public static final ۥ۟۟۠ۢ:Ljava/lang/String; = "Upgrade"

.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "Connection"

.field public static final synthetic ۥ۟۟۠ۤ:Z


# instance fields
.field public final ۥ۟۟:LYue/ۥ۠ۨۡۥ;

.field public ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

.field public ۥ۟۟۟۟:LYue/ۥ۠ۥ۟۟;

.field public ۥ۟۟۟۠:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

.field public ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

.field public ۥۣ۟۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06e3;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

.field public final ۥ۟۟۟ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

.field public final ۥ۟۟۟ۧ:Ljava/security/SecureRandom;

.field public ۥ۟۟۟ۨ:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۥ۟۟;)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;)V"
        }
    .end annotation

    .line 3
    new-instance v0, LYue/ۥۡۥۣۨ;

    const-string v1, ""

    invoke-direct {v0, v1}, LYue/ۥۡۥۣۨ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;I)V"
        }
    .end annotation

    .line 5
    new-instance v0, LYue/ۥۡۥۣۨ;

    const-string v1, ""

    invoke-direct {v0, v1}, LYue/ۥۡۥۣۨ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06e3;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7fffffff

    .line 4
    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06e3;",
            ">;I)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, LYue/ۥ۠۠۠۟;-><init>()V

    .line 7
    const-class v0, LYue/ۥ۠۠۠۠;

    invoke-static {v0}, LYue/ۥ۠ۨۡۦ;->ۥۣ۟۟۟(Ljava/lang/Class;)LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    .line 8
    new-instance v0, LYue/ۥ۟ۨۥۦ;

    invoke-direct {v0}, LYue/ۥ۟ۨۥۦ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    .line 9
    new-instance v0, LYue/ۥ۟ۨۥۦ;

    invoke-direct {v0}, LYue/ۥ۟ۨۥۦ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۟:LYue/ۥ۠ۥ۟۟;

    .line 10
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۧ:Ljava/security/SecureRandom;

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-lt p3, v0, :cond_3

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟:Ljava/util/List;

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۥ۟۟;

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, LYue/ۥ۟ۨۥۦ;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v0

    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-nez v2, :cond_2

    .line 17
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 18
    :cond_2
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    iput p3, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    return-void

    .line 21
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    check-cast p1, LYue/ۥ۠۠۠۠;

    iget v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-virtual {p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۢ()I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v2

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

    invoke-virtual {p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object p1

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_5
    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move v0, v1

    :goto_1
    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    ushr-int/lit8 v2, v1, 0x20

    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-super {p0}, LYue/ۥ۠۠۠۟;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " extension: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۥ۟۟;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " protocol: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۥۣ۟;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " max frame size: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥ۟ۤۨۡ;LYue/ۥۣۡۨۡ;)LYue/ۥ۠ۤۡۤ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    invoke-virtual {p0, p2}, LYue/ۥ۠۠۠۟;->ۥ۟۟(LYue/ۥ۠ۤۡۥ;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1

    :cond_0
    const-string v0, "Sec-WebSocket-Key"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟۠(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "Sec-WebSocket-Accept"

    invoke-interface {p2, v1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟۠(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p2, v1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1

    :cond_2
    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    const-string v0, "Sec-WebSocket-Extensions"

    invoke-interface {p2, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۥ۟۟;

    invoke-interface {v2, v0}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iput-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۡۤ;

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v1, "acceptHandshakeAsClient - Matching extension found: {}"

    invoke-interface {v0, v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    const-string v0, "Sec-WebSocket-Protocol"

    invoke-interface {p2, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۤ(Ljava/lang/String;)LYue/ۥ۠ۤۡۤ;

    move-result-object p2

    sget-object v0, LYue/ۥ۠ۤۡۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۡۤ;

    if-ne p2, v0, :cond_5

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "acceptHandshakeAsClient - No matching extension or protocol found."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1

    :cond_6
    :goto_0
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept"

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1
.end method

.method public ۥ۟(LYue/ۥ۟ۤۨۡ;)LYue/ۥ۠ۤۡۤ;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۟;->ۥ۟۟۠ۤ(LYue/ۥ۠ۤۡۥ;)I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v0, "acceptHandshakeAsServer - Wrong websocket version."

    invoke-interface {p1, v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1

    :cond_0
    sget-object v0, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    const-string v1, "Sec-WebSocket-Extensions"

    invoke-interface {p1, v1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۥ۟۟;

    invoke-interface {v3, v1}, LYue/ۥ۠ۥ۟۟;->ۥ۟(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iput-object v3, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    sget-object v0, LYue/ۥ۠ۤۡۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۡۤ;

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v2, "acceptHandshakeAsServer - Matching extension found: {}"

    invoke-interface {v1, v2, v3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    const-string v1, "Sec-WebSocket-Protocol"

    invoke-interface {p1, v1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۤ(Ljava/lang/String;)LYue/ۥ۠ۤۡۤ;

    move-result-object p1

    sget-object v1, LYue/ۥ۠ۤۡۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۡۤ;

    if-ne p1, v1, :cond_3

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v0, "acceptHandshakeAsServer - No matching extension or protocol found."

    invoke-interface {p1, v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1
.end method

.method public ۥ۟۟۟۠()LYue/ۥ۠۠۠۟;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ۟()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۥ۟۟;

    invoke-interface {v2}, LYue/ۥ۠ۥ۟۟;->ۥ()LYue/ۥ۠ۥ۟۟;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ۠()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۥۣ۟;

    invoke-interface {v3}, LYue/ۥ۠ۥۣ۟;->ۥ()LYue/ۥ۠ۥۣ۟;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v2, LYue/ۥ۠۠۠۠;

    iget v3, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-direct {v2, v0, v1, v3}, LYue/ۥ۠۠۠۠;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-object v2
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۣ۠۠۠;)Ljava/nio/ByteBuffer;
    .locals 4

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟(LYue/ۥۣ۠۠۠;)V

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    const/16 v3, 0x3e8

    if-le v2, v3, :cond_0

    const-string v2, "too big to display"

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    :goto_0
    const-string v3, "afterEnconding({}): {}"

    invoke-interface {v0, v3, v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۥ(LYue/ۥۣ۠۠۠;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۡ۠ۢ;

    invoke-direct {v0}, LYue/ۥۢۡ۠ۢ;-><init>()V

    invoke-static {p1}, LYue/ۥ۟ۤۤ۟;->ۥ۟۟۟ۢ(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, p2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۠۟(Z)V

    :try_start_0
    invoke-virtual {v0}, LYue/ۥۢۡ۠ۢ;->ۥ۟۟۟ۤ()V
    :try_end_0
    .catch LYue/ۥ۠ۥۧۤ; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, LYue/ۥۡۢۥۢ;

    invoke-direct {p2, p1}, LYue/ۥۡۢۥۢ;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public ۥۣ۟۟۟(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۢۧ;

    invoke-direct {v0}, LYue/ۥ۟ۢۧ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, p2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۠۟(Z)V

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۟ۨۢۤ;->ۥ۟۟۟ۤ()V
    :try_end_0
    .catch LYue/ۥ۠ۥۧۤ; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, LYue/ۥۡۢۥۢ;

    invoke-direct {p2, p1}, LYue/ۥۡۢۥۢ;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public ۥ۟۟۟ۨ()LYue/ۥ۟ۤۨۧ;
    .locals 1

    sget-object v0, LYue/ۥ۟ۤۨۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤۨۧ;

    return-object v0
.end method

.method public ۥ۟۟۠۟(LYue/ۥ۟ۤۨۢ;)LYue/ۥ۟ۤۨۢ;
    .locals 5

    const-string v0, "websocket"

    const-string v1, "Upgrade"

    invoke-interface {p1, v1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    invoke-interface {p1, v0, v1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۧ:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    const-string v1, "Sec-WebSocket-Key"

    invoke-static {v0}, LYue/ۥ۟ۢۥ۟;->ۥ۟۟۟ۡ([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Sec-WebSocket-Version"

    const-string v1, "13"

    invoke-interface {p1, v0, v1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, ", "

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۥ۟۟;

    invoke-interface {v2}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {v2}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "Sec-WebSocket-Extensions"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۥۣ۟;

    invoke-interface {v2}, LYue/ۥ۠ۥۣ۟;->ۥ۟()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_5

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-interface {v2}, LYue/ۥ۠ۥۣ۟;->ۥ۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "Sec-WebSocket-Protocol"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object p1
.end method

.method public ۥ۟۟۠۠(LYue/ۥ۟ۤۨۡ;LYue/ۥۣۡۨۢ;)LYue/ۥ۠ۤۡۡ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    const-string v0, "Upgrade"

    const-string v1, "websocket"

    invoke-interface {p2, v0, v1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Sec-WebSocket-Key"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Sec-WebSocket-Accept"

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Sec-WebSocket-Extensions"

    invoke-interface {p2, v0, p1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥ۠ۥۣ۟;->ۥ۟()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥ۠ۥۣ۟;->ۥ۟()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Sec-WebSocket-Protocol"

    invoke-interface {p2, v0, p1}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string p1, "Web Socket Protocol Handshake"

    invoke-interface {p2, p1}, LYue/ۥۣۡۨۢ;->ۥۣ۟۟۟(Ljava/lang/String;)V

    const-string p1, "Server"

    const-string v0, "TooTallNate Java-WebSocket"

    invoke-interface {p2, p1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Date"

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۦ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_2
    new-instance p1, LYue/ۥ۠ۥۧۧ;

    const-string p2, "missing Sec-WebSocket-Key"

    invoke-direct {p1, p2}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object v0

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V

    goto :goto_1

    :cond_0
    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۦ:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥۢۥۡۦ;->ۥ۟۟ۢ۟(LYue/ۥۢۥۡ۠;LYue/ۥۣ۠۠۠;)V

    goto :goto_1

    :cond_1
    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥۣ۟۟۟()V

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥۢۥۡۦ;->ۥۣ۟۟۠(LYue/ۥۢۥۡ۠;LYue/ۥۣ۠۠۠;)V

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    const/16 v2, 0x3ea

    if-nez v1, :cond_6

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_4

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥۣۣ۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V

    goto :goto_1

    :cond_4
    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۥ:LYue/ۥۣۣۡۢ;

    if-ne v0, v1, :cond_5

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "non control or continious frame expected"

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    invoke-direct {p1, v2, p2}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_6
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Protocol error: Continuous frame sequence not completed."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const-string p2, "Continuous frame sequence not completed."

    invoke-direct {p1, v2, p2}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_7
    :goto_0
    invoke-virtual {p0, p1, p2, v0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۠(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;LYue/ۥۣۣۡۢ;)V

    :goto_1
    return-void
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LYue/ۥ۠ۥ۟۟;->ۥۣ۟۟۟()V

    :cond_0
    new-instance v1, LYue/ۥ۟ۨۥۦ;

    invoke-direct {v1}, LYue/ۥ۟ۨۥۦ;-><init>()V

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

    return-void
.end method

.method public ۥ۟۟۠ۧ(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    :goto_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-le v2, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-virtual {v1, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v1}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۦ(Ljava/nio/ByteBuffer;)LYue/ۥۣ۠۠۠;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch LYue/ۥ۠ۥۡۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, LYue/ۥ۠ۥۡۡ;->ۥ()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟(I)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_1
    :goto_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    :try_start_1
    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۦ(Ljava/nio/ByteBuffer;)LYue/ۥۣ۠۠۠;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch LYue/ۥ۠ۥۡۡ; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    invoke-virtual {v1}, LYue/ۥ۠ۥۡۡ;->ۥ()I

    move-result v1

    invoke-virtual {p0, v1}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟(I)I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۦ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_2
    return-object v0
.end method

.method public final ۥ۟۟ۡۡ(Ljava/nio/ByteBuffer;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟ۡۢ()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۧ۠;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۨ()J

    move-result-wide v0

    iget v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    int-to-long v2, v2

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۡ()V

    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    iget v3, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Payload limit reached. Allowed: {} Current: {}"

    invoke-interface {v2, v1, v3, v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, LYue/ۥ۠ۧ۠;

    iget v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-direct {v0, v1}, LYue/ۥ۠ۧ۠;-><init>(I)V

    throw v0
.end method

.method public final ۥۣ۟۟ۡ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۥ۟۟ۡۤ(Ljava/lang/String;)LYue/ۥ۠ۤۡۤ;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۥۣ۟;

    invoke-interface {v1, p1}, LYue/ۥ۠ۥۣ۟;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v0, "acceptHandshake - Matching protocol found: {}"

    invoke-interface {p1, v0, v1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۡۤ;

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥ۠ۤۡۤ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۡۤ;

    return-object p1
.end method

.method public final ۥ۟۟ۡۥ(LYue/ۥۣ۠۠۠;)Ljava/nio/ByteBuffer;
    .locals 10

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۠۠۟;->ۥ:LYue/ۥۡۧ۟ۨ;

    sget-object v2, LYue/ۥۡۧ۟ۨ;->ۥۣ۟۟۠:LYue/ۥۡۧ۟ۨ;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {p0, v0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۧ(Ljava/nio/ByteBuffer;)I

    move-result v2

    if-le v2, v4, :cond_1

    add-int/lit8 v5, v2, 0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    add-int/2addr v5, v4

    const/4 v6, 0x4

    if-eqz v1, :cond_2

    move v7, v6

    goto :goto_2

    :cond_2
    move v7, v3

    :goto_2
    add-int/2addr v5, v7

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    add-int/2addr v5, v7

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object v7

    invoke-virtual {p0, v7}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۦ(LYue/ۥۣۣۡۢ;)B

    move-result v7

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۡ()Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, -0x80

    goto :goto_3

    :cond_3
    move v8, v3

    :goto_3
    int-to-byte v8, v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p0, v4}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۥ(I)B

    move-result v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    :cond_4
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟()Z

    move-result v8

    const/4 v9, 0x2

    if-eqz v8, :cond_5

    invoke-virtual {p0, v9}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۥ(I)B

    move-result v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    :cond_5
    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟۠()Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۥ(I)B

    move-result p1

    or-int/2addr p1, v7

    int-to-byte v7, p1

    :cond_6
    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    int-to-long v7, p1

    invoke-virtual {p0, v7, v8, v2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۤ(JI)[B

    move-result-object p1

    if-ne v2, v4, :cond_7

    aget-byte p1, p1, v3

    invoke-virtual {p0, v1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۡ(Z)B

    move-result v2

    or-int/2addr p1, v2

    int-to-byte p1, p1

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_7
    if-ne v2, v9, :cond_8

    invoke-virtual {p0, v1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۡ(Z)B

    move-result v2

    or-int/lit8 v2, v2, 0x7e

    int-to-byte v2, v2

    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_8
    const/16 v7, 0x8

    if-ne v2, v7, :cond_b

    invoke-virtual {p0, v1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۡ(Z)B

    move-result v2

    or-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_4
    if-eqz v1, :cond_9

    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۧ:Ljava/security/SecureRandom;

    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_5
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    rem-int/lit8 v2, v3, 0x4

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/2addr v3, v4

    goto :goto_5

    :cond_9
    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_a
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v5

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Size representation not supported/specified"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۡۦ(LYue/ۥۣۣۡۢ;)B
    .locals 3

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۥ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x8

    return p1

    :cond_3
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۦ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_4

    const/16 p1, 0x9

    return p1

    :cond_4
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_5

    const/16 p1, 0xa

    return p1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Don\'t know how to handle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟ۡۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    const-string v0, "SHA1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۢۥ۟;->ۥ۟۟۟ۡ([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ۥ۟۟ۡۨ()J
    .locals 6

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return-wide v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟:LYue/ۥ۠ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟۟ۢ۟()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۠:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۢ۠()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06df\u06e3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥۣ۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟۟ۢۡ(Z)B
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, -0x80

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۢۢ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    return v0
.end method

.method public final ۥۣ۟۟ۢ()Ljava/nio/ByteBuffer;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۧ۠;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۢ()V

    long-to-int v1, v2

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v1

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public ۥ۟۟ۢۤ()LYue/ۥ۠ۥۣ۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۢ:LYue/ۥ۠ۥۣ۟;

    return-object v0
.end method

.method public final ۥ۟۟ۢۥ(I)B
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/16 p1, 0x10

    return p1

    :cond_1
    const/16 p1, 0x20

    return p1

    :cond_2
    const/16 p1, 0x40

    return p1
.end method

.method public final ۥ۟۟ۢۦ()Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "EEE, dd MMM yyyy HH:mm:ss z"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "GMT"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۢۧ(Ljava/nio/ByteBuffer;)I
    .locals 2

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/16 v1, 0x7d

    if-gt v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    const v0, 0xffff

    if-gt p1, v0, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 p1, 0x8

    return p1
.end method

.method public final ۥ۟۟ۢۨ(LYue/ۥۢۥۡۥ;Ljava/lang/RuntimeException;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v1, "Runtime exception during onWebsocketMessage"

    invoke-interface {v0, v1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥۢۥۡۦ;->ۥۣ۟۟ۡ(LYue/ۥۢۥۡ۠;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۥۣ۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object v0

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LYue/ۥۢۥۡۦ;->ۥ۟۟۟۟(LYue/ۥۢۥۡ۠;Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۨ(LYue/ۥۢۥۡۥ;Ljava/lang/RuntimeException;)V

    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .locals 4

    instance-of v0, p2, LYue/ۥ۟ۤۨۥ;

    if-eqz v0, :cond_0

    check-cast p2, LYue/ۥ۟ۤۨۥ;

    invoke-virtual {p2}, LYue/ۥ۟ۤۨۥ;->ۥ۟۟۠۠()I

    move-result v0

    invoke-virtual {p2}, LYue/ۥ۟ۤۨۥ;->ۥ۟۟۠ۡ()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/16 v0, 0x3ed

    const-string p2, ""

    :goto_0
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۦ۠ۡ;

    move-result-object v1

    sget-object v2, LYue/ۥۡۦ۠ۡ;->ۥ۟۟۠ۥ:LYue/ۥۡۦ۠ۡ;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {p1, v0, p2, v3}, LYue/ۥۢۥۡۥ;->ۥ۟۟۟ۦ(ILjava/lang/String;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ()LYue/ۥ۟ۤۨۧ;

    move-result-object v1

    sget-object v2, LYue/ۥ۟ۤۨۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۤۨۧ;

    if-ne v1, v2, :cond_2

    invoke-virtual {p1, v0, p2, v3}, LYue/ۥۢۥۡۥ;->ۥ۟۟۟۟(ILjava/lang/String;Z)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۡ(ILjava/lang/String;Z)V

    :goto_1
    return-void
.end method

.method public final ۥۣ۟۟۠(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;LYue/ۥۣۣۡۢ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    if-eq p3, v0, :cond_0

    invoke-virtual {p0, p2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۢ(LYue/ۥۣ۠۠۠;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۡ(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    if-eqz p1, :cond_5

    :goto_0
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne p3, p1, :cond_3

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۤۤ۟;->ۥ۟(Ljava/nio/ByteBuffer;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Protocol error: Payload is not UTF8"

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const/16 p2, 0x3ef

    invoke-direct {p1, p2}, LYue/ۥ۠ۥۧۤ;-><init>(I)V

    throw p1

    :cond_3
    :goto_1
    if-ne p3, v0, :cond_4

    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    if-eqz p1, :cond_4

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۡ(Ljava/nio/ByteBuffer;)V

    :cond_4
    return-void

    :cond_5
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Protocol error: Continuous frame sequence was not started."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const/16 p2, 0x3ea

    const-string p3, "Continuous frame sequence was not started."

    invoke-direct {p1, p2, p3}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۡ(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    if-eqz v0, :cond_2

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p0, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۡ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۢ()V

    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object p2

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    check-cast p2, LYue/ۥۣ۠۠ۡ;

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p2, v0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    check-cast p2, LYue/ۥۣ۠۠ۡ;

    invoke-virtual {p2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۤ()V

    :try_start_0
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-interface {v0}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۤ۟;->ۥ۟۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, LYue/ۥۢۥۡۦ;->ۥ۟۟ۡ(LYue/ۥۢۥۡ۠;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۨ(LYue/ۥۢۥۡۥ;Ljava/lang/RuntimeException;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object p2

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۥ:LYue/ۥۣۣۡۢ;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    check-cast p2, LYue/ۥۣ۠۠ۡ;

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p2, v0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    iget-object p2, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    check-cast p2, LYue/ۥۣ۠۠ۡ;

    invoke-virtual {p2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۤ()V

    :try_start_1
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object p2

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-interface {v0}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p2, p1, v0}, LYue/ۥۢۥۡۦ;->ۥ۟۟۟۟(LYue/ۥۢۥۡ۠;Ljava/nio/ByteBuffer;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p2

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۨ(LYue/ۥۢۥۡۥ;Ljava/lang/RuntimeException;)V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۡ()V

    return-void

    :cond_2
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Protocol error: Previous continuous frame sequence not completed."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const/16 p2, 0x3ea

    const-string v0, "Continuous frame sequence was not started."

    invoke-direct {p1, p2, v0}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۢ(LYue/ۥۣ۠۠۠;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۤ:LYue/ۥۣ۠۠۠;

    invoke-interface {p1}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۡ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۡۢ()V

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v0, "Protocol error: Previous continuous frame sequence not completed."

    invoke-interface {p1, v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const/16 v0, 0x3ea

    const-string v1, "Previous continuous frame sequence not completed."

    invoke-direct {p1, v0, v1}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final ۥۣۣ۟۟(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢۢ()LYue/ۥۢۥۡۦ;

    move-result-object v0

    invoke-interface {p2}, LYue/ۥۣ۠۠۠;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-static {p2}, LYue/ۥ۟ۤۤ۟;->ۥ۟۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LYue/ۥۢۥۡۦ;->ۥ۟۟ۡ(LYue/ۥۢۥۡ۠;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢۨ(LYue/ۥۢۥۡۥ;Ljava/lang/RuntimeException;)V

    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟ۤ(JI)[B
    .locals 5

    new-array v0, p3, [B

    mul-int/lit8 v1, p3, 0x8

    add-int/lit8 v1, v1, -0x8

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_0

    mul-int/lit8 v3, v2, 0x8

    sub-int v3, v1, v3

    ushr-long v3, p1, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۥۣ۟۟ۥ(B)LYue/ۥۣۣۡۢ;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۦ;
        }
    .end annotation

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance v0, LYue/ۥ۠ۥۧۦ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown opcode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-short p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    return-object p1

    :pswitch_1
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۦ:LYue/ۥۣۣۡۢ;

    return-object p1

    :pswitch_2
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣۣۡۢ;

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۥ:LYue/ۥۣۣۡۢ;

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    return-object p1

    :cond_2
    sget-object p1, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۥۣ۟۟ۦ(Ljava/nio/ByteBuffer;)LYue/ۥۣ۠۠۠;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۡۡ;,
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    const/4 v5, 0x2

    invoke-virtual {p0, v6, v5}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۨ(II)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    shr-int/lit8 v1, v0, 0x8

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    move v8, v2

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move v9, v2

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move v10, v2

    goto :goto_2

    :cond_2
    move v10, v7

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move v11, v2

    goto :goto_3

    :cond_3
    move v11, v7

    :goto_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit8 v3, v1, -0x80

    if-eqz v3, :cond_4

    move v12, v2

    goto :goto_4

    :cond_4
    move v12, v7

    :goto_4
    and-int/lit8 v1, v1, 0x7f

    int-to-byte v3, v1

    and-int/lit8 v0, v0, 0xf

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۥ(B)LYue/ۥۣۣۡۢ;

    move-result-object v13

    if-ltz v3, :cond_5

    const/16 v0, 0x7d

    if-le v3, v0, :cond_6

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, v13

    move v4, v6

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۤ(Ljava/nio/ByteBuffer;LYue/ۥۣۣۡۢ;III)LYue/ۥ۠۠۠۠$ۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠۠۠۠$ۥ;->ۥ(LYue/ۥ۠۠۠۠$ۥ;)I

    move-result v3

    invoke-static {v0}, LYue/ۥ۠۠۠۠$ۥ;->ۥ۟(LYue/ۥ۠۠۠۠$ۥ;)I

    move-result v5

    :cond_6
    int-to-long v0, v3

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۧ(J)V

    const/4 v0, 0x4

    if-eqz v12, :cond_7

    move v1, v0

    goto :goto_5

    :cond_7
    move v1, v7

    :goto_5
    add-int/2addr v5, v1

    add-int/2addr v5, v3

    invoke-virtual {p0, v6, v5}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۨ(II)V

    invoke-virtual {p0, v3}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟(I)I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    if-eqz v12, :cond_8

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :goto_6
    if-ge v7, v3, :cond_9

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    rem-int/lit8 v4, v7, 0x4

    aget-byte v4, v0, v4

    xor-int/2addr v2, v4

    int-to-byte v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_9
    invoke-static {v13}, LYue/ۥۣ۠۠ۡ;->ۥۣ۟۟۟(LYue/ۥۣۣۡۢ;)LYue/ۥۣ۠۠ۡ;

    move-result-object p1

    invoke-virtual {p1, v8}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۥ(Z)V

    invoke-virtual {p1, v9}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۧ(Z)V

    invoke-virtual {p1, v10}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۨ(Z)V

    invoke-virtual {p1, v11}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۠(Z)V

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {p1, v1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟()LYue/ۥۣۣۡۢ;

    move-result-object v0

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥۣ۟۟۠:LYue/ۥۣۣۡۢ;

    if-eq v0, v1, :cond_c

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_7

    :cond_a
    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۟:LYue/ۥ۠ۥ۟۟;

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    goto :goto_8

    :cond_b
    :goto_7
    invoke-virtual {p0}, LYue/ۥ۠۠۠۠;->ۥ۟۟ۢ()LYue/ۥ۠ۥ۟۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    :cond_c
    :goto_8
    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    if-nez v0, :cond_d

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟۟:LYue/ۥ۠ۥ۟۟;

    iput-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    :cond_d
    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    invoke-interface {v0, p1}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟۠(LYue/ۥۣ۠۠۠;)V

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥ۟۟;

    invoke-interface {v0, p1}, LYue/ۥ۠ۥ۟۟;->ۥ۟۟۟(LYue/ۥۣ۠۠۠;)V

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۢ()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    const/16 v3, 0x3e8

    if-le v2, v3, :cond_e

    const-string v2, "too big to display"

    goto :goto_9

    :cond_e
    new-instance v2, Ljava/lang/String;

    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    :goto_9
    const-string v3, "afterDecoding({}): {}"

    invoke-interface {v0, v3, v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f
    invoke-virtual {p1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۤ()V

    return-object p1

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۥۣ۟۟ۧ(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۧ۠;
        }
    .end annotation

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_2

    iget v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    int-to-long v1, v0

    cmp-long v1, p1, v1

    if-gtz v1, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Limit underflow: Payloadsize is to little..."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۧ۠;

    const-string p2, "Payloadsize is to little..."

    invoke-direct {p1, p2}, LYue/ۥ۠ۧ۠;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "Payload limit reached. Allowed: {} Current: {}"

    invoke-interface {v1, p2, v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, LYue/ۥ۠ۧ۠;

    const-string p2, "Payload limit reached."

    iget v0, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟۟ۨ:I

    invoke-direct {p1, p2, v0}, LYue/ۥ۠ۧ۠;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Limit exedeed: Payloadsize is to big..."

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۧ۠;

    const-string p2, "Payloadsize is to big..."

    invoke-direct {p1, p2}, LYue/ۥ۠ۧ۠;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۨ(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۡۡ;
        }
    .end annotation

    if-lt p1, p2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string v0, "Incomplete frame: maxpacketsize < realpacketsize"

    invoke-interface {p1, v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۡۡ;

    invoke-direct {p1, p2}, LYue/ۥ۠ۥۡۡ;-><init>(I)V

    throw p1
.end method

.method public final ۥ۟۟ۤ(Ljava/nio/ByteBuffer;LYue/ۥۣۣۡۢ;III)LYue/ۥ۠۠۠۠$ۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۦ;,
            LYue/ۥ۠ۥۡۡ;,
            LYue/ۥ۠ۧ۠;
        }
    .end annotation

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۦ:LYue/ۥۣۣۡۢ;

    if-eq p2, v0, :cond_2

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۧ:LYue/ۥۣۣۡۢ;

    if-eq p2, v0, :cond_2

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣۣۡۢ;

    if-eq p2, v0, :cond_2

    const/16 p2, 0x7e

    if-ne p3, p2, :cond_0

    const/4 p2, 0x2

    add-int/2addr p5, p2

    invoke-virtual {p0, p4, p5}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۨ(II)V

    const/4 p3, 0x3

    new-array p3, p3, [B

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p4

    const/4 v0, 0x1

    aput-byte p4, p3, v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    aput-byte p1, p3, p2

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p3}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    move-result p1

    goto :goto_1

    :cond_0
    const/16 p2, 0x8

    add-int/2addr p5, p2

    invoke-virtual {p0, p4, p5}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۨ(II)V

    new-array p3, p2, [B

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p2, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    aput-byte v0, p3, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p3}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠۠۠۠;->ۥۣ۟۟ۧ(J)V

    long-to-int p1, p1

    :goto_1
    new-instance p2, LYue/ۥ۠۠۠۠$ۥ;

    invoke-direct {p2, p0, p1, p5}, LYue/ۥ۠۠۠۠$ۥ;-><init>(LYue/ۥ۠۠۠۠;II)V

    return-object p2

    :cond_2
    iget-object p1, p0, LYue/ۥ۠۠۠۠;->ۥ۟۟:LYue/ۥ۠ۨۡۥ;

    const-string p2, "Invalid frame: more than 125 octets"

    invoke-interface {p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    new-instance p1, LYue/ۥ۠ۥۧۦ;

    const-string p2, "more than 125 octets"

    invoke-direct {p1, p2}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw p1
.end method
