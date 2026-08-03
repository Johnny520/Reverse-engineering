.class public final LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۢۧ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Z

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۧۤ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥ۠ۢۧ۠;

    invoke-static {p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۧ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۣ۟۟;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥۣۢ۟ۡ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۧ۠;-><init>(LYue/ۥۢۡۤۧ;)V

    iput-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧ۠;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Z

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;

    iget-object v1, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧ۠;

    invoke-static {v0, v1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۤۧۤ;LYue/ۥ۠ۢۧ۠;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;

    const/4 v1, 0x3

    invoke-static {v0, v1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠۠(LYue/ۥ۠ۤۧۤ;I)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;

    invoke-static {v0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۧ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۣ۟۟;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->flush()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧ۠;

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 7
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۨ(JJJ)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۧۤ;

    invoke-static {v0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۧ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۣ۟۟;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۣۢ۟ۡ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
