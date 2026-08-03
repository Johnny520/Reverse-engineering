.class public LYue/ۥۡۥۨۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۥۨۦ$ۥ۟;,
        LYue/ۥۡۥۨۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۡۥۨۦ$ۥ۟;

.field public static final ۥ۟۟۟:LYue/ۥۡۥۨۦ;


# instance fields
.field public final ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

.field public final ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۥۨۦ$ۥ۟;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1, v1}, LYue/ۥۡۥۨۦ$ۥ۟;-><init>(III)V

    sput-object v0, LYue/ۥۡۥۨۦ;->ۥ۟۟:LYue/ۥۡۥۨۦ$ۥ۟;

    new-instance v1, LYue/ۥۡۥۨۦ;

    invoke-direct {v1, v0, v0}, LYue/ۥۡۥۨۦ;-><init>(LYue/ۥۡۥۨۦ$ۥ۟;LYue/ۥۡۥۨۦ$ۥ۟;)V

    sput-object v1, LYue/ۥۡۥۨۦ;->ۥ۟۟۟:LYue/ۥۡۥۨۦ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۨۦ$ۥ۟;LYue/ۥۡۥۨۦ$ۥ۟;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    iput-object p2, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    return-void
.end method

.method public static synthetic ۥ()LYue/ۥۡۥۨۦ$ۥ۟;
    .locals 1

    sget-object v0, LYue/ۥۡۥۨۦ;->ۥ۟۟:LYue/ۥۡۥۨۦ$ۥ۟;

    return-object v0
.end method

.method public static ۥ۟۟۟۠(LYue/ۥۣۡۢۤ;Z)LYue/ۥۡۥۨۦ;
    .locals 1

    if-eqz p1, :cond_0

    const-string p1, "jsoup.start"

    goto :goto_0

    :cond_0
    const-string p1, "jsoup.end"

    :goto_0
    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢ()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p0, LYue/ۥۡۥۨۦ;->ۥ۟۟۟:LYue/ۥۡۥۨۦ;

    return-object p0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object p0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, LYue/ۥۡۥۨۦ;

    goto :goto_1

    :cond_2
    sget-object p0, LYue/ۥۡۥۨۦ;->ۥ۟۟۟:LYue/ۥۡۥۨۦ;

    :goto_1
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥۡۥۨۦ;

    iget-object v1, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    iget-object v2, p1, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v1, v2}, LYue/ۥۡۥۨۦ$ۥ۟;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    iget-object p1, p1, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۨۦ$ۥ۟;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۡۥۨۦ$ۥ۟;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v1}, LYue/ۥۡۥۨۦ$ۥ۟;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥۡۥۨۦ$ۥ۟;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۥۨۦ$ۥ۟;->ۥ(LYue/ۥۡۥۨۦ$ۥ۟;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥۡۥۨۦ;->ۥ۟۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    iget-object v1, p0, LYue/ۥۡۥۨۦ;->ۥ۟:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-virtual {v0, v1}, LYue/ۥۡۥۨۦ$ۥ۟;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    sget-object v0, LYue/ۥۡۥۨۦ;->ۥ۟۟۟:LYue/ۥۡۥۨۦ;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥۡۥۨۦ$ۥ۟;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ;->ۥ:LYue/ۥۡۥۨۦ$ۥ۟;

    invoke-static {v0}, LYue/ۥۡۥۨۦ$ۥ۟;->ۥ(LYue/ۥۡۥۨۦ$ۥ۟;)I

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۣۡۢۤ;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
