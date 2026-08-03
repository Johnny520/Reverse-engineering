.class public final LYue/ۥۡۡۦۣ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e1\u06e6\u06e3$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, LYue/ۥۡۡۦۣ$ۥ;-><init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const-string v0, "boundary"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ:LYue/ۥۣ۟ۥۤ;

    .line 4
    sget-object p1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۢ:LYue/ۥۡ۠ۥۨ;

    iput-object p1, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "randomUUID().toString()"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, LYue/ۥۡۡۦۣ$ۥ;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟:LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟۟(LYue/ۥۡۡۦۣ$ۥ۟۟;)LYue/ۥۡۡۦۣ$ۥ;

    return-object p0
.end method

.method public final ۥ۟(Ljava/lang/String;Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟:LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟۟(LYue/ۥۡۡۦۣ$ۥ۟۟;)LYue/ۥۡۡۦۣ$ۥ;

    return-object p0
.end method

.method public final ۥ۟۟(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟:LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟۟(LYue/ۥۡۡۦۣ$ۥ۟۟;)LYue/ۥۡۡۦۣ$ۥ;

    return-object p0
.end method

.method public final ۥ۟۟۟(LYue/ۥۡۡۦۣ$ۥ۟۟;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۡۦۣ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "part"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۡۦۣ$ۥ۟۟;->ۥ۟۟:LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ۟(LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟۟(LYue/ۥۡۡۦۣ$ۥ۟۟;)LYue/ۥۡۡۦۣ$ۥ;

    return-object p0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥۡۡۦۣ;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۡۡۦۣ;

    iget-object v1, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ:LYue/ۥۣ۟ۥۤ;

    iget-object v2, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    iget-object v3, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟۟:Ljava/util/List;

    invoke-static {v3}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۟(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, LYue/ۥۡۡۦۣ;-><init>(LYue/ۥۣ۟ۥۤ;LYue/ۥۡ۠ۥۨ;Ljava/util/List;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۡۦۣ$ۥ;
    .locals 2
    .param p1    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡ۠ۥۨ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multipart"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LYue/ۥۡۡۦۣ$ۥ;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "multipart != "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
