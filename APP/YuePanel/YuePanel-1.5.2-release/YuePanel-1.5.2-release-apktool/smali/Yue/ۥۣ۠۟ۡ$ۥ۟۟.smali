.class public final LYue/ۥۣ۠۟ۡ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;,
        LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/Map;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ۟;

    new-instance v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object v2

    invoke-static {}, LYue/ۥ۠ۨۧۧ;->ۥ۟۟ۡ()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;-><init>(Ljava/util/Set;LYue/ۥۣ۠۟ۡ$ۥ۟;Ljava/util/Map;)V

    sput-object v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;LYue/ۥۣ۠۟ۡ$ۥ۟;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۟ۡ$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5\u06df;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;>;>;)V"
        }
    .end annotation

    const-string v0, "flags"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedViolations"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ:Ljava/util/Set;

    iput-object p2, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Set;

    invoke-interface {p1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ:Ljava/util/Set;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥۣ۠۟ۡ$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/Map;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟:Ljava/util/Map;

    return-object v0
.end method
