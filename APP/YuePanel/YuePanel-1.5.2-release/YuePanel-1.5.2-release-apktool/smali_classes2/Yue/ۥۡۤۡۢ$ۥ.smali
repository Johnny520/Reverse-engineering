.class public final LYue/ۥۡۤۡۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۡۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۤۡۢ$ۥ;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۡۤۡۢ$ۥ;)LYue/ۥۡۤۡۢ;
    .locals 0

    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟۠()LYue/ۥۡۤۡۢ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۧ(LYue/ۥۡۤۡۢ$ۥ;LYue/ۥۡۤۡۢ;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟۠()LYue/ۥۡۤۡۢ;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۦ(LYue/ۥۡۤۡۢ;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "protocols"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LYue/ۥۡۥۣۧ;

    sget-object v3, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۥ:LYue/ۥۡۥۣۧ;

    if-eq v2, v3, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LYue/ۥ۟ۥۡۤ;->ۥۣ۟۟ۡ(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۥۣۧ;

    invoke-virtual {v1}, LYue/ۥۡۥۣۧ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public final ۥ۟۟(Ljava/util/List;)[B
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
            ">;)[B"
        }
    .end annotation

    const-string v0, "protocols"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v0}, LYue/ۥۣ۟ۢۨ;-><init>()V

    invoke-virtual {p0, p1}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۢۨ;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡ۟()[B

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟()LYue/ۥۡۤۡۢ;
    .locals 1

    sget-object v0, LYue/ۥ۟۠ۥ;->ۥ:LYue/ۥ۟۠ۥ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۥ;->ۥ۟()V

    sget-object v0, LYue/ۥ۟۠ۤۢ;->ۥ۟۟۟ۡ:LYue/ۥ۟۠ۤۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۤۢ$ۥ;->ۥ()LYue/ۥۡۤۡۢ;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۟۠ۥۡ;->ۥ۟۟۟ۢ:LYue/ۥ۟۠ۥۡ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۥۡ$ۥ;->ۥ()LYue/ۥۡۤۡۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۡۤۡۢ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥ۟ۦۨ۠;->ۥ۟۟۟ۡ:LYue/ۥ۟ۦۨ۠$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۦۨ۠$ۥ;->ۥ۟۟()LYue/ۥ۟ۦۨ۠;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥۣ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LYue/ۥۣ۟ۡۨ;->ۥ۟۟۟ۡ:LYue/ۥۣ۟ۡۨ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۨ$ۥ;->ۥ()LYue/ۥۣ۟ۡۨ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۥ()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LYue/ۥۣۣۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۣۣۡۧ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣۣۡۧ$ۥ;->ۥ()LYue/ۥۣۣۡۧ;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LYue/ۥ۠ۦ۟۟;->ۥ۟۟۟۠:LYue/ۥ۠ۦ۟۟$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۦ۟۟$ۥ;->ۥ()LYue/ۥ۠ۦ۟۟;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LYue/ۥ۠ۥۨۨ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۥۨۨ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠ۥۨۨ$ۥ۟;->ۥ()LYue/ۥۡۤۡۢ;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, LYue/ۥۡۤۡۢ;

    invoke-direct {v0}, LYue/ۥۡۤۡۢ;-><init>()V

    return-object v0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥۡۤۡۢ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟()LYue/ۥۡۤۡۢ;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟۟()LYue/ۥۡۤۡۢ;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۡۤۡۢ;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {}, LYue/ۥۡۤۡۢ;->ۥ()LYue/ۥۡۤۡۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 2

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Dalvik"

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥۣ۟۟۟()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BC"

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Conscrypt"

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۥ()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OpenJSSE"

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۦ(LYue/ۥۡۤۡۢ;)V
    .locals 1
    .param p1    # LYue/ۥۡۤۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "platform"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۤۡۢ;->ۥ۟(LYue/ۥۡۤۡۢ;)V

    return-void
.end method
