.class public abstract LYue/ۥ۟ۨۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# instance fields
.field public ۥ:LYue/ۥ۟ۨ۠ۢ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۢ;

    iput-object v0, p0, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۨ۠ۢ;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨۡۢ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨۡۢ;

    iget-object v1, p0, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    if-nez v1, :cond_2

    iget-object p1, p1, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    if-eqz p1, :cond_3

    return v2

    :cond_2
    iget-object p1, p1, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۨ۠ۢ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public abstract ۥ(Ljava/io/PrintWriter;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public ۥ۟()LYue/ۥ۟ۨ۠ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    return-object v0
.end method

.method public ۥ۟۟(LYue/ۥ۟ۨ۠ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡۢ;->ۥ:LYue/ۥ۟ۨ۠ۢ;

    return-void
.end method
