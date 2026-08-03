.class public final LYue/ۥ۟ۧۥۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۧۥۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:J

.field public ۥ۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Z

.field public ۥۣ۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0xe677d21fdbffL

    iput-wide v0, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟:J

    const-string v0, "/"

    iput-object v0, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۟ۧۥۨ;
    .locals 13
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v12, LYue/ۥ۟ۧۥۨ;

    iget-object v1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-wide v3, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟:J

    iget-object v5, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    if-eqz v5, :cond_0

    iget-object v6, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟۟:Ljava/lang/String;

    iget-boolean v7, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟۠:Z

    iget-boolean v8, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟ۡ:Z

    iget-boolean v9, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟ۢ:Z

    iget-boolean v10, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥۣ۟۟۟:Z

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LYue/ۥ۟ۧۥۨ;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLYue/ۥ۟ۨۥۢ;)V

    return-object v12

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "builder.domain == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "builder.value == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "builder.name == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟(Ljava/lang/String;)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "domain"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;Z)LYue/ۥ۟ۧۥۨ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/String;Z)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 2

    invoke-static {p1}, LYue/ۥ۠ۤۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    iput-boolean p2, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥۣ۟۟۟:Z

    return-object p0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected domain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟(J)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/high16 p1, -0x8000000000000000L

    :cond_0
    const-wide v0, 0xe677d21fdbffL

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    move-wide p1, v0

    :cond_1
    iput-wide p1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟:J

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟ۢ:Z

    return-object p0
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "domain"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟(Ljava/lang/String;Z)LYue/ۥ۟ۧۥۨ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠()LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟ۡ:Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۢ۟ۢ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "name is not trimmed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "/"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, LYue/ۥۢ۠ۢۤ;->ۥۣ۟۠ۤ(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "path must start with \'/\'"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟۟()LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟۟۟۠:Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/String;)LYue/ۥ۟ۧۥۨ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۢ۟ۢ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LYue/ۥ۟ۧۥۨ$ۥ;->ۥ۟:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "value is not trimmed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
