.class public final LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۦۣ$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"
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
    invoke-direct {p0}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;
    .locals 2
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "Content-Type"

    invoke-virtual {p1, v1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_3

    if-eqz p1, :cond_1

    const-string v1, "Content-Length"

    invoke-virtual {p1, v1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_2

    new-instance v1, LYue/ۥۡۡۦۣ$ۥ۟۟;

    invoke-direct {v1, p1, p2, v0}, LYue/ۥۡۡۦۣ$ۥ۟۟;-><init>(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;LYue/ۥ۟ۨۥۢ;)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected header: Content-Length"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected header: Content-Type"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟(LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۡۦۣ$ۥ۟۟;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۦۥ;->ۥ:LYue/ۥۡۦۥ$ۥ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p2, v2, v1, v2}, LYue/ۥۡۦۥ$ۥ;->ۥ۟۟۠۠(LYue/ۥۡۦۥ$ۥ;Ljava/lang/String;LYue/ۥۡ۠ۥۨ;ILjava/lang/Object;)LYue/ۥۡۦۥ;

    move-result-object p2

    invoke-virtual {p0, p1, v2, p2}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;
    .locals 2
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
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "form-data; name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LYue/ۥۡۡۦۣ;->ۥ۟۟۟ۡ:LYue/ۥۡۡۦۣ$ۥ۟;

    invoke-virtual {v1, v0, p1}, LYue/ۥۡۡۦۣ$ۥ۟;->ۥ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string p1, "; filename="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0, p2}, LYue/ۥۡۡۦۣ$ۥ۟;->ۥ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-direct {p2}, LYue/ۥ۠ۤۢۢ$ۥ;-><init>()V

    const-string v0, "Content-Disposition"

    invoke-virtual {p2, v0, p1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, LYue/ۥۡۡۦۣ$ۥ۟۟$ۥ;->ۥ(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;)LYue/ۥۡۡۦۣ$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method
