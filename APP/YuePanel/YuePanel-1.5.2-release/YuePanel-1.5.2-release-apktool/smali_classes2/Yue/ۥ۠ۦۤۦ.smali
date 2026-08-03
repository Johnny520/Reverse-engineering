.class public final LYue/ۥ۠ۦۤۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.1"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۦۤۦ$ۥ;,
        LYue/ۥ۠ۦۤۦ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥ۠ۦۤۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥ۠ۦۤۦ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥ۠ۦۤۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠ۦۣۤ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۦۤۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۦۤۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۦۤۦ;->ۥ۟۟:LYue/ۥ۠ۦۤۦ$ۥ;

    new-instance v0, LYue/ۥ۠ۦۤۦ;

    invoke-direct {v0, v1, v1}, LYue/ۥ۠ۦۤۦ;-><init>(LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;)V

    sput-object v0, LYue/ۥ۠ۦۤۦ;->ۥ۟۟۟:LYue/ۥ۠ۦۤۦ;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;)V
    .locals 3
    .param p1    # LYue/ۥ۠ۦۤۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۦۣۤ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    iput-object p2, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez p2, :cond_1

    move v0, v1

    :cond_1
    if-ne v2, v0, :cond_2

    return-void

    :cond_2
    if-nez p1, :cond_3

    const-string p1, "Star projection must have no type specified."

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The projection variance "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requires type to be specified."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final ۥ۟۟(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;
    .locals 1
    .param p0    # LYue/ۥ۠ۦۣۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۦۤۦ;->ۥ۟۟:LYue/ۥ۠ۦۤۦ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۦۤۦ$ۥ;->ۥ(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۠ۦۤۦ;LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;ILjava/lang/Object;)LYue/ۥ۠ۦۤۦ;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۦۤۦ;->ۥ۟۟۟(LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;
    .locals 1
    .param p0    # LYue/ۥ۠ۦۣۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۦۤۦ;->ۥ۟۟:LYue/ۥ۠ۦۤۦ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۦۤۦ$ۥ;->ۥ۟(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;
    .locals 1
    .param p0    # LYue/ۥ۠ۦۣۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۦۤۦ;->ۥ۟۟:LYue/ۥ۠ۦۤۦ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۦۤۦ$ۥ;->ۥ۟۟۟۟(LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۠ۦۤۦ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۠ۦۤۦ;

    iget-object v1, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    iget-object v3, p1, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    iget-object p1, p1, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, LYue/ۥ۠ۦۤۦ$ۥ۟;->ۥ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    if-eq v0, v1, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "out "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v0, LYue/ۥۣۣۡۢ;

    invoke-direct {v0}, LYue/ۥۣۣۡۢ;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, "*"

    :goto_1
    return-object v0
.end method

.method public final ۥ()LYue/ۥ۠ۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥ۠ۦۣۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    return-object v0
.end method

.method public final ۥ۟۟۟(LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;)LYue/ۥ۠ۦۤۦ;
    .locals 1
    .param p1    # LYue/ۥ۠ۦۤۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۦۣۤ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۦۤۦ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠ۦۤۦ;-><init>(LYue/ۥ۠ۦۤۧ;LYue/ۥ۠ۦۣۤ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥ۠ۦۣۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ۟:LYue/ۥ۠ۦۣۤ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥ۠ۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۤۦ;->ۥ:LYue/ۥ۠ۦۤۧ;

    return-object v0
.end method
