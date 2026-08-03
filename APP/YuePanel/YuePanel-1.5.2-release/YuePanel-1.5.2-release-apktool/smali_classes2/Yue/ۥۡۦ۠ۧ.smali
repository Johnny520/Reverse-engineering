.class public final LYue/ۥۡۦ۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۦۤ$ۥ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۦ۠ۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e5\u06e6\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:LYue/ۥۡۦۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:I

.field public final ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:I


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۠ۤ;Ljava/util/List;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;III)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e0\u06e4;",
            "Ljava/util/List<",
            "+",
            "LYue/\u06e5\u06e0\u06e5\u06e6\u06e4;",
            ">;I",
            "LYue/\u06e5\u06e0\u06e1\u06e3\u06df;",
            "LYue/\u06e5\u06e1\u06e6\u06e4\u06e7;",
            "III)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p5, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦ۠ۧ;->ۥ:LYue/ۥۡۦ۠ۤ;

    iput-object p2, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    iput p3, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    iput-object p4, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    iput-object p5, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۟:LYue/ۥۡۦۤۧ;

    iput p6, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۠:I

    iput p7, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۡ:I

    iput p8, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۢ:I

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۟:LYue/ۥۡۦۤۧ;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۠:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۡ:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۢ:I

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move-object p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۤ(ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;III)LYue/ۥۡۦ۠ۧ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public call()LYue/ۥۣ۟ۦۣ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ:LYue/ۥۡۦ۠ۤ;

    return-object v0
.end method

.method public ۥ(ILjava/util/concurrent/TimeUnit;)LYue/ۥ۠ۥۦۤ$ۥ;
    .locals 12
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "unit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    if-nez v0, :cond_0

    const-string v0, "writeTimeout"

    int-to-long v1, p1

    invoke-static {v0, v1, v2, p2}, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۧ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v9

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v11}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Timeouts can\'t be adjusted in a network interceptor"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟()LYue/ۥۡۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۟:LYue/ۥۡۦۤۧ;

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۡ:I

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۢ:I

    return v0
.end method

.method public ۥ۟۟۟۟(ILjava/util/concurrent/TimeUnit;)LYue/ۥ۠ۥۦۤ$ۥ;
    .locals 12
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "unit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    if-nez v0, :cond_0

    const-string v0, "connectTimeout"

    int-to-long v1, p1

    invoke-static {v0, v1, v2, p2}, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۧ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v7

    const/16 v10, 0x37

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v11}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Timeouts can\'t be adjusted in a network interceptor"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠()LYue/ۥ۟ۦۧۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۠ۡ۟;->ۥ۟۟۟ۢ()LYue/ۥۡۦ۠ۥ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۟ۡ(ILjava/util/concurrent/TimeUnit;)LYue/ۥ۠ۥۦۤ$ۥ;
    .locals 12
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "unit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    if-nez v0, :cond_0

    const-string v0, "readTimeout"

    int-to-long v1, p1

    invoke-static {v0, v1, v2, p2}, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۧ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v8

    const/16 v10, 0x2f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v11}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Timeouts can\'t be adjusted in a network interceptor"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۠:I

    return v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ;
    .locals 13
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    iget-object v1, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_7

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥۣ۟۟۟:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥۡۦ۠ۧ;->ۥۣ۟۟۟:I

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    const-string v2, " must call proceed() exactly once"

    const-string v3, "network interceptor "

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥۣ۠ۡ۟;->ۥ۟۟۟ۤ()LYue/ۥۣ۠ۡۡ;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v4

    invoke-virtual {v0, v4}, LYue/ۥۣ۠ۡۡ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۤۨۥ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥۣ۟۟۟:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    iget v3, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    sub-int/2addr v3, v1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    iget v2, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " must retain the same host and port"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    add-int/lit8 v5, v0, 0x1

    const/16 v11, 0x3a

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p0

    move-object v7, p1

    invoke-static/range {v4 .. v12}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    iget v4, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۥۦۤ;

    invoke-interface {v0, p1}, LYue/ۥ۠ۥۦۤ;->ۥ(LYue/ۥ۠ۥۦۤ$ۥ;)LYue/ۥۡۦۧ;

    move-result-object v4

    const-string v5, "interceptor "

    if-eqz v4, :cond_6

    iget-object v6, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    if-eqz v6, :cond_4

    iget v6, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟:I

    add-int/2addr v6, v1

    iget-object v7, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_4

    iget p1, p1, LYue/ۥۡۦ۠ۧ;->ۥۣ۟۟۟:I

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    invoke-virtual {v4}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object p1

    if-eqz p1, :cond_5

    return-object v4

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned a response with no body"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۤ(ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;III)LYue/ۥۡۦ۠ۧ;
    .locals 11
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    move-object v0, p0

    const-string v1, "request"

    move-object v7, p3

    invoke-static {p3, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LYue/ۥۡۦ۠ۧ;

    iget-object v3, v0, LYue/ۥۡۦ۠ۧ;->ۥ:LYue/ۥۡۦ۠ۤ;

    iget-object v4, v0, LYue/ۥۡۦ۠ۧ;->ۥ۟:Ljava/util/List;

    move-object v2, v1

    move v5, p1

    move-object v6, p2

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-direct/range {v2 .. v10}, LYue/ۥۡۦ۠ۧ;-><init>(LYue/ۥۡۦ۠ۤ;Ljava/util/List;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;III)V

    return-object v1
.end method

.method public final ۥ۟۟۟ۦ()LYue/ۥۡۦ۠ۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ:LYue/ۥۡۦ۠ۤ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۠:I

    return v0
.end method

.method public final ۥ۟۟۟ۨ()LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method

.method public final ۥ۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۡ:I

    return v0
.end method

.method public final ۥ۟۟۠۟()LYue/ۥۡۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟۟:LYue/ۥۡۦۤۧ;

    return-object v0
.end method

.method public final ۥ۟۟۠۠()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۢ:I

    return v0
.end method
