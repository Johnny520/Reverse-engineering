.class public final LYue/ۥۡۦۥ$ۥ$ۥ;
.super LYue/ۥۡۦۥ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۥ$ۥ;->ۥ۟۟۟ۢ(Ljava/io/File;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟:LYue/ۥۡ۠ۥۨ;

.field public final synthetic ۥ۟۟:Ljava/io/File;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۥۨ;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۥ$ۥ$ۥ;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    iput-object p2, p0, LYue/ۥۡۦۥ$ۥ$ۥ;->ۥ۟۟:Ljava/io/File;

    invoke-direct {p0}, LYue/ۥۡۦۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()J
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ;->ۥ۟۟:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟()LYue/ۥۡ۠ۥۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    return-object v0
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۟;)V
    .locals 2
    .param p1    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ;->ۥ۟۟:Ljava/io/File;

    invoke-static {v0}, LYue/ۥۣۡۡ;->ۥۣ۟۟۠(Ljava/io/File;)LYue/ۥۣۢ۟ۦ;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, LYue/ۥۣۣ۟۟;->ۥ۟۟۟ۧ(LYue/ۥۣۢ۟ۦ;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v0, p1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
