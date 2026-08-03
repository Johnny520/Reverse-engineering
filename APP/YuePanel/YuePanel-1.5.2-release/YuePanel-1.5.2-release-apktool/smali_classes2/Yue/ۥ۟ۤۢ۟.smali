.class public final LYue/ۥ۟ۤۢ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥ۠ۦۡ;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۤۢ۟$ۥ۟۟;,
        LYue/ۥ۟ۤۢ۟$ۥ;,
        LYue/ۥ۟ۤۢ۟$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:LYue/ۥ۟ۤۢ۟$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟ۤۢ۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۤۢ۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۤۢ۟;->ۥ۟:LYue/ۥ۟ۤۢ۟$ۥ۟;

    new-instance v0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥ۟ۤۢ۟$ۥ۟۟;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۢ۟;->ۥ۟۟:LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۢ۟;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ()LYue/ۥ۟ۤۢ۟$ۥ۟۟;
    .locals 1

    sget-object v0, LYue/ۥ۟ۤۢ۟;->ۥ۟۟:LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    return-object v0
.end method

.method public static final synthetic ۥ۟(Ljava/lang/Object;)LYue/ۥ۟ۤۢ۟;
    .locals 1

    new-instance v0, LYue/ۥ۟ۤۢ۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۤۢ۟;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥ۟ۤۢ۟;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥ۟ۤۢ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۠()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۟ۤۢ۟$ۥ;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    iget-object v1, p0, LYue/ۥ۟ۤۢ۟$ۥ;->ۥ:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public static synthetic ۥ۟۟۟ۡ()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LYue/ۥ۟ۤۢ۟$ۥ;

    iget-object v0, v0, LYue/ۥ۟ۤۢ۟$ۥ;->ۥ:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to call \'getOrThrow\' on a failed channel result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/lang/Object;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۥ(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, LYue/ۥ۟ۤۢ۟$ۥ;

    return p0
.end method

.method public static final ۥ۟۟۟ۦ(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۥ۟۟۟ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۟ۤۢ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥ۟ۤۢ۟$ۥ;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Value("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۢ۟;->ۥ:Ljava/lang/Object;

    invoke-static {v0, p1}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۢ۟;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۤ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۢ۟;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ۥ۟۟۠()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۢ۟;->ۥ:Ljava/lang/Object;

    return-object v0
.end method
