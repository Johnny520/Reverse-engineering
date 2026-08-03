.class public final LYue/ۥ۟ۦۧۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:[Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:[Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟:Z


# direct methods
.method public constructor <init>(LYue/ۥ۟ۦۧۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۦۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "connectionSpec"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, LYue/ۥ۟ۦۧۨ;->ۥۣ۟۟۟()Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    .line 5
    invoke-static {p1}, LYue/ۥ۟ۦۧۨ;->ۥ۟۟۟(LYue/ۥ۟ۦۧۨ;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    .line 6
    invoke-static {p1}, LYue/ۥ۟ۦۧۨ;->ۥ۟۟۟۟(LYue/ۥ۟ۦۧۨ;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, LYue/ۥ۟ۦۧۨ;->ۥ۟۟۟ۥ()Z

    move-result p1

    iput-boolean p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no cipher suites for cleartext connections"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟()LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no TLS versions for cleartext connections"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟()LYue/ۥ۟ۦۧۨ;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۧۨ;

    iget-boolean v1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    iget-boolean v2, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟:Z

    iget-object v3, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    iget-object v4, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥ۟ۦۧۨ;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public final varargs ۥ۟۟۟([LYue/ۥ۟ۤۦۣ;)LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 5
    .param p1    # [LYue/ۥ۟ۤۦۣ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "cipherSuites"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, LYue/ۥ۟ۤۦۣ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟۟([Ljava/lang/String;)LYue/ۥ۟ۦۧۨ$ۥ;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs ۥ۟۟۟۟([Ljava/lang/String;)LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "cipherSuites"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_2

    array-length v0, p1

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one cipher suite is required"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟۠()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    return v0
.end method

.method public final ۥۣ۟۟۟()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ([Ljava/lang/String;)V
    .locals 0
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟:[Ljava/lang/String;

    return-void
.end method

.method public final ۥ۟۟۟ۥ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟:Z

    return-void
.end method

.method public final ۥ۟۟۟ۦ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    return-void
.end method

.method public final ۥ۟۟۟ۧ([Ljava/lang/String;)V
    .locals 0
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    return-void
.end method

.method public final ۥ۟۟۟ۨ(Z)LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect."
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_0

    iput-boolean p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۟:Z

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no TLS extensions for cleartext connections"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs ۥ۟۟۠([LYue/ۥۢۡۧ۟;)LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 5
    .param p1    # [LYue/ۥۢۡۧ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "tlsVersions"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, LYue/ۥۢۡۧ۟;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟۠۟([Ljava/lang/String;)LYue/ۥ۟ۦۧۨ$ۥ;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs ۥ۟۟۠۟([Ljava/lang/String;)LYue/ۥ۟ۦۧۨ$ۥ;
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "tlsVersions"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ:Z

    if-eqz v0, :cond_2

    array-length v0, p1

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, LYue/ۥ۟ۦۧۨ$ۥ;->ۥ۟۟:[Ljava/lang/String;

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one TLS version is required"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
